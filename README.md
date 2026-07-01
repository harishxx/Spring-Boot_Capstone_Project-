# Spring Boot Capstone Project

## 📌 Overview

This project is a RESTful web application developed using Java and Spring Boot. It follows a layered architecture consisting of Controller, Service, Repository, and Entity layers. The application performs CRUD operations using a MySQL database and demonstrates backend development best practices with Spring Data JPA, Hibernate, and Maven.

---

## 🚀 Features

* RESTful API Development
* Create, Read, Update and Delete (CRUD) Operations
* Layered Architecture
* Spring Data JPA Integration
* Hibernate ORM
* MySQL Database Connectivity
* Request Validation
* Clean Code Structure
* Maven Build Management

---

## 🛠️ Tech Stack

| Technology              | Version         |
| ----------------------- | --------------- |
| Java                    | 21              |
| Spring Boot             | 3.x             |
| Spring Data JPA         | Latest          |
| Hibernate               | ORM             |
| MySQL                   | Database        |
| Maven                   | Build Tool      |
| Postman                 | API Testing     |
| Git & GitHub            | Version Control |
| VS Code / IntelliJ IDEA | IDE             |

---

## 📁 Project Structure

```text
src
└── main
    ├── java
    │   └── com.example.project
    │       ├── controller
    │       ├── service
    │       ├── repository
    │       ├── entity
    │       └── ProjectApplication.java
    │
    └── resources
        ├── application.properties
        └── static
```
---

## 🏗️ Architecture

```text
                Client
                  │
                  ▼
          REST API Request
                  │
                  ▼
             Controller
                  │
                  ▼
               Service
                  │
                  ▼
             Repository
                  │
                  ▼
          MySQL Database
```

---

## ⚙️ Prerequisites

Before running this project, make sure the following software is installed:

* Java 21
* Maven
* MySQL Server
* Git
* VS Code or IntelliJ IDEA

---

## 🗄️ Database Configuration

Update the following properties inside `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## ▶️ How to Run

### Clone Repository

```bash
git clone https://github.com/harishxx/Spring-Boot_Capstone_Project-.git
```

### Open Project

```bash
cd Spring-Boot_Capstone_Project-
```

### Install Dependencies

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

Application starts at:

```text
http://localhost:8080
```

---

## 📡 REST APIs

| Method | Endpoint    | Description      |
| ------ | ----------- | ---------------- |
| POST   | `/api/...`  | Create Data      |
| GET    | `/api/...`  | Get All Records  |
| GET    | `/api/{id}` | Get Record by ID |
| PUT    | `/api/{id}` | Update Record    |
| DELETE | `/api/{id}` | Delete Record    |

> Replace the endpoints above with your actual API paths.

---

## 🧪 API Testing

All APIs were tested using **Postman**.

Recommended screenshots:

* Home Screen
* POST Request
* GET Request
* PUT Request
* DELETE Request
* MySQL Database Tables
* Console Output

---

## 📦 Maven Dependencies

* Spring Boot Starter Web
* Spring Boot Starter Data JPA
* MySQL Connector
* Lombok (Optional)
* Validation
* Spring Boot Starter Test

---

## ✨ Future Enhancements

* JWT Authentication
* Spring Security
* Role-Based Authorization
* Swagger / OpenAPI Documentation
* Docker Support
* Unit Testing using JUnit & Mockito
* Pagination & Sorting
* Search and Filtering APIs
* Logging with SLF4J
* Cloud Deployment (AWS / Azure / Railway)

---

## 👨‍💻 Author

**Harish M**

Backend Developer | Java | Spring Boot | MySQL

GitHub:
https://github.com/harishxx

---

## 📄 License

This project is developed for educational and portfolio purposes.
