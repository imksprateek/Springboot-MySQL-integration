# Java SpringBoot MySQL Integration

This project is a Java SpringBoot application that integrates with a MySQL database. It provides routes to retrieve all database rows and to add a new row.

## Setup

1. Clone the repository:
```bash
git clone https://github.com/yourusername/springboot-mysql-integration.git
```
Navigate to the project directory:

```bash
cd springboot-mysql-integration
```
Make sure you have MySQL installed and running on your system.

Create a MySQL database named springbootdb:

```sql
CREATE DATABASE springbootdb;
```

Configure the MySQL connection settings in src/main/resources/application.properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb
spring.datasource.username=your_username
spring.datasource.password=your_password
```

Run the application:

```bash
./mvnw spring-boot:run
```

## API Endpoints
Get All Users
URL: /all
Method: GET
Description: Retrieves all user records from the database.

Example Response:
```json
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "john@example.com"
  },
  {
    "id": 2,
    "name": "Jane Smith",
    "email": "jane@example.com"
  },
  ...
]
```
Add User
URL: /add
Method: POST
Description: Adds a new user record to the database.
Request Body:
```json
{
  "name": "New User",
  "email": "newuser@example.com"
}
```
Example Response:
```json
{
  "id": 3,
  "name": "New User",
  "email": "newuser@example.com"
}
```
## Dependencies
Spring Boot <br>
MySQL Connector
