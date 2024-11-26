Valley School Management System
This is a role-based school management system with separate dashboards for Admins and Students.

Features

Admin Dashboard

Manage Courses: Add, update, or delete course details.
Manage Classes: Create and organize class schedules.
Messages: View messages and notifications displayed in the dashboard.

Student Dashboard

Course Details: View available courses and their descriptions.
Class Schedule: Check class times and updates.


Tech Stack
Backend: Spring Boot
Database: MySQL
IDE: IntelliJ IDEA
Frontend: (Specify the technology, e.g., Angular, React, or plain HTML/CSS/JavaScript)

Prerequisites
Ensure the following are installed on your system:

IntelliJ IDEA
MySQL Server
Setup Instructions
Step 1: Clone the Repository
bash
Copy code
CLONE THIS REPOSITORY
cd valley-school-management

Step 2: Create MySQL Database

Open MySQL Workbench or any SQL client.
Run the following command to create the database:
sql

CREATE DATABASE valleyschool;
Step 3: Configure Application Properties
Update the src/main/resources/application.properties file with your MySQL credentials:

properties

spring.datasource.url=jdbc:mysql://localhost:3306/valleyschool
spring.datasource.username=your username
spring.datasource.password=your password

Step 4: Run the Application

Open the project in IntelliJ IDEA.
Build the project to ensure all dependencies are downloaded.
Run the application using the main class:
Path: src/main/java/com/valleyschool/ValleySchoolApplication.java
Right-click and select Run.

Step 5: Access the Dashboards

Admin Dashboard: http://localhost:8080/admin
Student Dashboard: http://localhost:8080/student

Contribution
Feel free to contribute to the project by opening issues or submitting pull requests.
