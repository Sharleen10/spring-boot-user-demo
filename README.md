# Spring Boot User Management Demo

## 🧩 Overview
A simple Spring Boot project demonstrating basic architecture, annotations, and dependency injection. This project implements a user management system with in-memory storage using a layered architecture approach.

## 🚀 Technologies
- Java 21 
- Spring Boot 3.1.0
- JUnit 5
- Mockito

## 📂 Project Structure
- **Model**: `User.java` - Contains user entity data
- **Repository**: `FakeRepoInterface.java`, `FakeRepo.java` - In-memory storage simulation
- **Service**: `UserService.java`, `UserServiceImpl.java` - Business logic layer
- **Tests**: `UserServiceTests.java` - Unit tests for service methods

## ✨ Features
- Add users with name and surname
- Retrieve users by ID
- Remove users from the system
- In-memory storage (mocked database)
- Unit testing with mock dependencies

## ▶️ How to Run
1. Clone the repository
2. Run using Gradle:
   ```bash
   ./gradlew bootRun

   The application will start and print:
   Spring Boot User Management Demo is running!
   
🧪 How to Test
Run the unit tests using Gradle:

  ```bash
./gradlew test

## 📚 Key Concepts Demonstrated
Dependency Injection: Using constructor injection with @Autowired

Spring Boot Annotations: @SpringBootApplication, @Service, @Repository

Layered Architecture: Separation of concerns (Model, Repository, Service)

Interface-based Design: Programming to interfaces for flexibility

Unit Testing: Isolated testing using JUnit and Mockito

📁 Project File Details
build.gradle – Dependencies and project setup

DemoApplication.java – Spring Boot main application class

User.java – User model class

FakeRepoInterface.java – Repository interface

FakeRepo.java – Repository implementation (in-memory)

UserService.java – Service interface

UserServiceImpl.java – Business logic implementation

UserServiceTests.java – Unit tests for service methods

📁 Project Structure

spring-boot-user-demo/
├── build.gradle
├── settings.gradle
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           └── demo
    │   │               ├── DemoApplication.java
    │   │               ├── model
    │   │               │   └── User.java
    │   │               ├── repo
    │   │               │   ├── FakeRepoInterface.java
    │   │               │   └── FakeRepo.java
    │   │               └── service
    │   │                   ├── UserService.java
    │   │                   └── UserServiceImpl.java
    │   └── resources
    │       ├── application.properties
    │       └── static/
    └── test
        └── java
            └── com
                └── example
                    └── demo
                        └── service
                            └── UserServiceTests.java


🔀 Git Branch Workflow Overview
                   +-----------------------------+
                   |     feature/model-user      |
                   +-----------------------------+
                                |
                                v
                   +-----------------------------+
                   |    feature/integration       |
                   +-----------------------------+
                                |
                                v
                   +-----------------------------+
                   |           develop           | ← ✅ Stable development
                   +-----------------------------+
                                |
                                v
                   +-----------------------------+
                   |            main             | ← 🚀 Production-ready code
                   +-----------------------------+

🛠️ Workflow Summary:
Develop features in separate branches like feature/service-userService

Merge those into feature/integration to test combinations

After validation, merge feature/integration → develop

Finally, merge develop → main when the project is ready for release
