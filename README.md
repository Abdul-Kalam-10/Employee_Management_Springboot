# Springboot- Employee Management System

Overview
This is a Spring Boot CRUD application designed to manage an Employee Management System. It utilizes RESTful APIs for handling operations and stores data in a MongoDB database.

Features
Add new employees
View all employees
View a specific employee by ID
Update employee details
Delete an employee 

Technologies Used
Spring Boot
Spring Data MongoDB
MongoDB
Maven

Getting Started
Prerequisites
Java 11 or higher
Maven
MongoDB

Installation
Clone the repository: Clone the project repository from GitHub.
Configure MongoDB: Ensure your MongoDB server is running. The application connects to MongoDB on localhost with the default port 27017. Modify this configuration if needed in the application.properties file.
Build the application: Use Maven to clean and install the project dependencies.
Run the application: Start the application using the Spring Boot Maven plugin.

API Endpoints
Create a New Employee
Endpoint: /api/employees
Method: POST
Description: Creates a new employee record in the system.
Get All Employees
Endpoint: /api/employees
Method: GET
Description: Retrieves a list of all employees.
Get an Employee by ID
Endpoint: /api/employees/{id}
Method: GET
Description: Retrieves the details of a specific employee by their ID.
Update an Employee
Endpoint: /api/employees/{id}
Method: PUT
Description: Updates the details of a specific employee by their ID.
Delete an Employee
Endpoint: /api/employees/{id}
Method: DELETE
Description: Deletes a specific employee by their ID.
Configuration
application.properties
Configure the application properties in the src/main/resources/application.properties file. The default configuration connects to a local MongoDB instance. Modify the host, port, and database name as per your setup.

Project Link: https://github.com/Abdul-Kalam-10/Employee_Management_Springboot.git
