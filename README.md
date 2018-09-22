# Linker

_Cайт для хранения заметок и файлов с возможностью регулирования количества показов_

### Стек технологий:

* Java 8
* Hibernate
* MySQL
* Spring Boot
* Thymeleaf

### Запуск проекта:

1. Прописать данные БД (MySQL) в /src/main/resources/application.properties;

2. Создать таблицы, используя команды из /db/db.sql;

3. Установить Maven, если он еще не установлен, и запустить проект из папки, в которой находится проект:
`$ cd $HOME_PROJECT`
`$ mvn spring-boot:run`

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
