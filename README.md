# Linker

_Cайт для хранения заметок и файлов с возможностью регулирования количества показов_

### Стек технологий:

* Java 8
* Hibernate
* MySQL
* Spring Boot
* Thymeleaf

### Запуск проекта:

1. Прописать данные БД (MySQL) в /src/main/resources/application.properties, к примеру:
~~~~
spring.datasource.url=jdbc:mysql://localhost:3306/DB?useUnicode=yes&characterEncoding=UTF-8
spring.datasource.username=root
spring.datasource.password=password
~~~~

2. Создать таблицы в БД, используя команды из /db/db.sql;

3. Установить Maven, если он еще не установлен, и запустить проект из папки, в которой находится проект:
~~~~
cd $HOME_PROJECT
mvn spring-boot:run
~~~~

4. По дефолту сайт будет доступен по порту 8080 (http://localhost:8080).

### Скриншоты:

* Создание заметки:

![](https://raw.githubusercontent.com/applepinepaprica/linker/master/images/image3887.png)

* Результат:

![](https://raw.githubusercontent.com/applepinepaprica/linker/master/images/image3898.png)
![](https://raw.githubusercontent.com/applepinepaprica/linker/master/images/image3909.png)

* Если достигнуто максимальное количество показов:

![](https://raw.githubusercontent.com/applepinepaprica/linker/master/images/image3920.png)

* После регистрации на сайте и создания заметок под логином есть возможность просмотреть список заметок и количество их просмотров:

![](https://raw.githubusercontent.com/applepinepaprica/linker/master/images/image3931.png)
