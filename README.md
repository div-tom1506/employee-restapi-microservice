# Employee Rest API Microservice

This is a simple Spring Boot project that provides a REST API for performing CRUD operations on employee information.

## Features

* Create an employee
* Retrieve all employees
* Retrieve a specific employee by ID
* Retrieve a specific employee by name
* Sort employees by age
* Update an employee's details
* Delete an employee
* Exception handling
* Logging with SLF4J
* CI/CD Pipeline with Jenkins

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* SQL Database
* SLF4J for logging
* Jenkins for CI/CD

## Installation

### Prerequisites

* Java 17+
* Maven

### Steps

**Clone the repository:**

    git clone https://github.com/div-tom1506/employee-restapi-microservice.git

    cd employee-restapi-microservice

**Build the project:**

    mvn clean install

**Run the application:**

    mvn spring-boot:run

## API Endpoints
| Method | Endpoint           | Description                |
|--------|-------------------|----------------------------|
| POST   | `/employee/create`      | Create a new employee     |
| GET    | `/employee/all`      | Get all employees         |
| GET    | `/employee/{id}` | Get employee by ID        |
| GET    | `/employee/name/{name}` | Get employee by name        |
| GET    | `/employee/sortByName` | Get employees sorted by age        |
| PUT    | `/employee/update/{id}` | Update an employee        |
| DELETE | `/employee/remove/{id}` | Delete an employee        |

## Logging

The application uses SLF4J for logging important events such as fetching, creating, updating, and deleting employees.

## Exception Handling

The application has a global exception handler to manage exceptions gracefully.

## CI/CD Pipeline with Jenkins

This project includes a Jenkins pipeline for automated building, testing, and deployment. Below is an overview of the pipeline stages:

### Jenkinsfile Stages:

**Checkout -** Clones the GitHub repository.

**Build -** Uses Maven to build the project.

**Test -** Runs unit tests.

**Deploy -** Deploys the application (can be customized as needed).

**Post Actions -** Cleans workspace and handles success/failure notifications.

## License

This project is open-source under the MIT License.
