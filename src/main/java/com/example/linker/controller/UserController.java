package com.example.linker.controller;

import com.example.linker.model.User;
import com.example.linker.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute(new User());
        return "login";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registrationGet(Model model) {
        model.addAttribute(new User());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registrationPost(@Valid User user, BindingResult bindingResult, Model model) {

        if (user.getPassword().length() < 8 || user.getPassword().length() > 20) {
            bindingResult.rejectValue("password", "error.user", "Password must be between 8 and 20 characters");
        }

        if (StringUtils.isBlank(user.getPassword())) {
            bindingResult.rejectValue("password", "error.user", "Password cannot be blank");
        }

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        try {
            userService.save(user);
        } catch (DataIntegrityViolationException e) {
            bindingResult.rejectValue("username", "error.user", "An account with this username already exists");
            return "registration";
        }

        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }
}