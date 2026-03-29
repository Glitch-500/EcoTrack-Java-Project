# EcoTrack: Personal Carbon Footprint & Sustainability Manager
B.Tech Capstone Project | Programming in Java (CSE-AIML)

## Project Overview
EcoTrack is a Java-based utility designed to solve the problem of "Estimation Fatigue" in personal sustainability. The application allows users to log daily activities—specifically transportation—and see their environmental impact in real-time. 

Unlike basic calculators, this project uses a multi-layered Java architecture to ensure that tracking is interactive, persistent, and scalable, bridging the gap between daily habits and data-driven environmental awareness.

--- 
 
## Core Java Concepts Implemented
To satisfy the course evaluation criteria, this project implements the following technical modules:

### 1. Object-Oriented Programming (OOP) - Modules 1 & 2
* Abstraction: The project uses an abstract class Activity.java. This acts as a template, forcing any future modules (like Diet or Electricity) to implement the calculateCO2() method, ensuring consistent behavior across the app.
* Inheritance & Polymorphism: The Transportation.java class extends the base Activity. It overrides the calculation logic to apply specific emission factors (0.21 kg/km for cars), demonstrating high code reusability.

### 2. Concurrency & Multithreading - Module 3
* Background Engine: I implemented the EcoTipThread.java class which extends the Thread library. 
* Asynchronous Logic: This allows the "Eco-Tips" engine to run independently. While the Main Thread waits for user input, the Background Thread pushes sustainability advice to the console every 15 seconds, creating a dynamic user experience.

### 3. Data Management & Collections - Module 4
* Dynamic Storage: Instead of static arrays, the project utilizes an ArrayList<Activity>. This allows the application to handle an unlimited number of logs in a single session, providing flexibility and efficient memory management.

### 4. Database Persistence (JDBC) - Module 5
* Data Integrity: The DatabaseManager.java class acts as the Data Access Object (DAO). It manages the JDBC lifecycle—loading the MySQL driver, establishing a connection, and executing INSERT statements.
* Audit Trail: Every log entry is stored in a MySQL backend, ensuring that user data is not lost when the program terminates.

---

## Project Structure
* Activity.java: The abstract model for all CO2-producing tasks.
* Transportation.java: Specialized logic for vehicle emission factors.
* EcoTipThread.java: The Concurrency Engine for background engagement.
* DatabaseManager.java: The JDBC handler for MySQL connectivity.
* EcoTrackMain.java: The presentation layer and interactive user menu.

---

## Setup & Execution
1. Prerequisites: Install JDK 17+ and MySQL 8.0.
2. Database: Import the provided db_setup.sql to create the activity_logs table.
3. Driver: Ensure mysql-connector-j.jar is added to your project's classpath.
4. Compile & Run:
   javac *.java
   java EcoTrackMain

