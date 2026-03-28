# EcoTrack: Personal Carbon Footprint Tracker
**Course:** Programming in Java | **Status:** Capstone Project

## Project Overview
EcoTrack is a Java-based application designed to help users calculate their daily CO2 emissions. It demonstrates core Java concepts required for the course.

## Java Concepts Used
* **Abstraction:** Used `Activity.java` as a base class.
* **Inheritance:** `Transportation.java` extends Activity.
* **Multithreading:** `EcoTipThread.java` runs in the background to show tips.
* **Collections:** Used `ArrayList` to store session logs.
* **JDBC:** Database logic implemented in `DatabaseManager.java`.

## Setup & Run
1. Ensure you have **JDK 17+** and **MySQL** installed.
2. Add the `mysql-connector-java.jar` to your classpath.
3. Compile all files: `javac *.java`
4. Run the app: `java EcoTrackMain`