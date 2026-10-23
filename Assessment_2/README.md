#  Assessment 2: Java Practical Test (10 Problems)

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Training](https://img.shields.io/badge/UPS-Full_Stack_Training-blue?style=for-the-badge&logo=ups&logoColor=white)
![Assessment](https://img.shields.io/badge/Assessment-02-success?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-Loops_•_Arrays_•_OOP_•_Collections_•_Threads_•_Files-purple?style=for-the-badge)

</div>

---

##  Table of Contents
1. [Overview](#-overview)
2. [Problem Solutions & Explanations](#-problem-solutions--explanations)
   - [1. Number Pattern and Loops: Armstrong Numbers (`Armstrong.java`)](#1-number-pattern-and-loops-armstrong-numbers-armstrongjava)
   - [2. Array Operations: Second-Largest Distinct Element (`SecondLargest.java`)](#2-array-operations-second-largest-distinct-element-secondlargestjava)
   - [3. OOP – Inheritance & Polymorphism (`EmployeeSalary.java`)](#3-oop--inheritance--polymorphism-employeesalaryjava)
   - [4. ArrayList – Student Management (`StudentManagement.java`)](#4-arraylist--student-management-studentmanagementjava)
   - [5. HashSet – Remove Duplicates (`RemoveDuplicates.java`)](#5-hashset--remove-duplicates-removeduplicatesjava)
   - [6. HashMap – Word Frequency Counter (`WordFrequency.java`)](#6-hashmap--word-frequency-counter-wordfrequencyjava)
   - [7. Multithreading – Synchronized Ticket Booking (`TicketBooking.java`)](#7-multithreading--synchronized-ticket-booking-ticketbookingjava)
   - [8. Multithreading – Producer-Consumer Communication (`ProducerConsumer.java`)](#8-multithreading--producer-consumer-communication-producerconsumerjava)
   - [9. File Handling – Student Records (`StudentFileRecords.java`)](#9-file-handling--student-records-studentfilerecordsjava)
   - [10. Mini Project – Employee Record Manager (`EmployeeManager.java`)](#10-mini-project--employee-record-manager-employeemanagerjava)
3. [ Compilation & Execution Guide](#-compilation--execution-guide)

---

##  Overview

This assessment encompasses 10 core practical programming challenges testing fundamental to advanced Java capabilities:
* **Algorithmic thinking**: Loops, digits extraction, and non-sorting array traversal.
* **Object-Oriented Programming**: Polymorphism, inheritance, and encapsulation.
* **Java Collections Framework**: `ArrayList`, `HashSet`, and `HashMap`.
* **Concurrency & Multithreading**: Thread synchronization, shared resources, `wait()` and `notify()`.
* **File I/O**: `BufferedReader`, `BufferedWriter`, and persistent data handling.

---

##  Problem Solutions & Explanations

### 1. Number Pattern and Loops: Armstrong Numbers (`Armstrong.java`)
* **Objective:** Print all Armstrong numbers between 1 and 1000 using loops without built-in methods.
* **Concept:** An Armstrong number (for 3-digit numbers) is equal to the sum of the cubes of its digits.
* **File:** [`Armstrong.java`](./Armstrong.java)
* **Output:**
  ```text
  Armstrong numbers between 1 and 1000:
  1 153 370 371 407 
  ```

---

### 2. Array Operations: Second-Largest Distinct Element (`SecondLargest.java`)
* **Objective:** Find the second-largest distinct element in an array without using `Arrays.sort()`.
* **Concept:** Single-pass tracking of `largest` and `secondLargest`, ignoring duplicate values of the largest.
* **File:** [`SecondLargest.java`](./SecondLargest.java)
* **Output:**
  ```text
  Input Array: [12, 45, 7, 45, 32, 18]
  Second largest: 32
  ```

---

### 3. OOP – Inheritance & Polymorphism (`EmployeeSalary.java`)
* **Objective:** Salary system with base class `Employee` and subclasses `FullTimeEmployee` (20% bonus) and `PartTimeEmployee` (`hoursWorked * hourlyRate`).
* **Concept:** Method overriding and runtime polymorphism (`Employee` reference invoking overridden `calculateSalary()` and `display()`).
* **File:** [`EmployeeSalary.java`](./EmployeeSalary.java)
* **Output:**
  ```text
  === Employee Salary System (Polymorphism) ===
  ID: 101 | Name: Aasrith | Basic Salary: 50000.0 | Final Salary: 60000.0
  ID: 102 | Name: Rohith | Hours: 45 | Rate: 600.0 | Final Salary: 27000.0
  ```

---

### 4. ArrayList – Student Management (`StudentManagement.java`)
* **Objective:** Manage student records using `ArrayList`: add at least 5 students, filter marks > 75, search by roll number, update marks, remove by roll number, and sort descending by marks.
* **Concept:** Dynamic resizing, object references, and custom sorting using `Collections.sort()` with a `Comparator`.
* **File:** [`StudentManagement.java`](./StudentManagement.java)

---

### 5. HashSet – Remove Duplicates (`RemoveDuplicates.java`)
* **Objective:** Filter duplicate numbers from an array using `HashSet`, check membership of `40`, and explain why order is not guaranteed.
* **Concept:** Hash table bucket distribution determined by `hashCode()`, eliminating insertion order guarantees.
* **File:** [`RemoveDuplicates.java`](./RemoveDuplicates.java)
* **Output:**
  ```text
  Original Array: [10, 20, 10, 30, 20, 40, 50, 30]
  Unique values in HashSet: [50, 20, 40, 10, 30]
  Number of unique elements: 5
  Does set contain 40? true
  ```

---

### 6. HashMap – Word Frequency Counter (`WordFrequency.java`)
* **Objective:** Count word occurrences in a sentence ignoring case differences, find the most frequent word, and gracefully handle empty input.
* **Concept:** Key-value pairs (`HashMap<String, Integer>`) and sentence normalization.
* **File:** [`WordFrequency.java`](./WordFrequency.java)
* **Output:**
  ```text
  Input Sentence: "java is easy and java is powerful"
  Word Frequencies: {java=2, powerful=1, and=1, is=2, easy=1}
  Most Frequently Occurring Word: "java" (appeared 2 times)
  ```

---

### 7. Multithreading – Synchronized Ticket Booking (`TicketBooking.java`)
* **Objective:** Simulate 3 customer threads attempting to book 4 tickets each from an initial pool of 10 tickets, ensuring tickets never go negative.
* **Concept:** Method-level `synchronized` locking to protect shared mutable state and avoid race conditions.
* **File:** [`TicketBooking.java`](./TicketBooking.java)
* **Output:**
  ```text
  === Ticket Booking Simulation Started (Initial Tickets: 10) ===

  Customer-1 requested 4 ticket(s)...
  SUCCESS: Customer-1 booked 4 ticket(s). Remaining tickets: 6

  Customer-2 requested 4 ticket(s)...
  SUCCESS: Customer-2 booked 4 ticket(s). Remaining tickets: 2

  Customer-3 requested 4 ticket(s)...
  FAILED: Sorry Customer-3, not enough tickets! Requested: 4, Available: 2
  ```

---

### 8. Multithreading – Producer-Consumer Communication (`ProducerConsumer.java`)
* **Objective:** Inter-thread communication using `wait()` and `notify()` to produce and consume numbers 1 through 5 in lockstep order.
* **Concept:** Thread coordination, monitor locking, and avoidance of missed notifications.
* **File:** [`ProducerConsumer.java`](./ProducerConsumer.java)

---

### 9. File Handling – Student Records (`StudentFileRecords.java`)
* **Objective:** Write at least 5 records to `students.txt`, append a new student using append mode, read all records, and find the student with the highest marks.
* **Concept:** `BufferedWriter(..., true)` append mode, `BufferedReader`, and string parsing.
* **File:** [`StudentFileRecords.java`](./StudentFileRecords.java)

---

### 10. Mini Project – Employee Record Manager (`EmployeeManager.java`)
* **Objective:** Complete menu-driven CRUD application combining OOP, `ArrayList` (storage), `HashMap` (fast lookup by ID), `HashSet` (enforcing unique IDs), and persistent file storage.
* **Menu Options:**
  1. Add Employee (with unique ID validation via `HashSet`)
  2. Search Employee ($O(1)$ fast lookup via `HashMap`)
  3. Update Salary
  4. Delete Employee (synchronized across List, Map, and Set)
  5. Display All Employees
  6. Save to File and Exit
* **File:** [`EmployeeManager.java`](./EmployeeManager.java)

---

##  Compilation & Execution Guide

Compile all assessment programs:
```powershell
javac Assessment_2/*.java
```

Run any specific problem:
```powershell
java -cp Assessment_2 Armstrong
java -cp Assessment_2 SecondLargest
java -cp Assessment_2 EmployeeSalary
java -cp Assessment_2 StudentManagement
java -cp Assessment_2 RemoveDuplicates
java -cp Assessment_2 WordFrequency
java -cp Assessment_2 TicketBooking
java -cp Assessment_2 ProducerConsumer
java -cp Assessment_2 StudentFileRecords
java -cp Assessment_2 EmployeeManager
```

---

<p align="center">
  <i>Documented and maintained by Ponguru Aasrith Sairam</i>
</p>
