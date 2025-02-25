# Employee Rest API Microservice

This is a simple Spring Boot project that provides a REST API for performing CRUD operations on employee information.

## Features

* Create an employee
* Retrieve all employees
* Retrieve a specific employee by ID
* Retrieve a specific employee by name
* Update an employee's details
* Delete an employee
* Exception handling
* Logging with SLF4J

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* SLF4J for logging

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
| GET    | `/employee/all`      | Get all employees         |
| GET    | `/employee/{id}` | Get employee by ID        |
| GET    | `/employee/name/{name}` | Get employee by name        |
| POST   | `/employee/create`      | Create a new employee     |
| PUT    | `/employee/update/{id}` | Update an employee        |
| DELETE | `/employee/remove/{id}` | Delete an employee        |

## Logging

The application uses SLF4J for logging important events such as fetching, creating, updating, and deleting employees.

## Exception Handling

The application has a global exception handler to manage exceptions gracefully.

## License

This project is open-source under the MIT License.
