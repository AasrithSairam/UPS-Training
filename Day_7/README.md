# 📅 Day 7: Interfaces, Custom Exceptions & Jagged Arrays

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Training](https://img.shields.io/badge/UPS-Full_Stack_Training-blue?style=for-the-badge&logo=ups&logoColor=white)
![Day](https://img.shields.io/badge/Day-07-success?style=for-the-badge)
![Focus](https://img.shields.io/badge/Focus-Interfaces_•_Exceptions_•_Jagged_Arrays-purple?style=for-the-badge)

</div>

---

## 📖 Table of Contents
1. [🌟 Day 7 Overview](#-day-7-overview)
2. [💳 Payment System: Interface-Based Polymorphism (`Payment.java`)](#-payment-system-interface-based-polymorphism-paymentjava)
3. [🛡️ ATM System: Custom Exceptions & Error Handling (`ATM.java` & `atmMain.java`)](#️-atm-system-custom-exceptions--error-handling-atmjava--atmmainjava)
4. [📊 2D Jagged Arrays in Java (`Jagged.java`)](#-2d-jagged-arrays-in-java-jaggedjava)
5. [🏛️ Abstract Classes: Banking Rules Engine (`Bank.java`)](#️-abstract-classes-banking-rules-engine-bankjava)
6. [🚀 Compilation & Execution Guide](#-compilation--execution-guide)

---

## 🌟 Day 7 Overview

Day 7 focused on core Java enterprise patterns:
* **Interfaces**: Decoupling caller from implementation through the `PaymentMode` interface (`UPI`, `Cash`, `Card`).
* **Robust Exception Handling**: Building custom checked exceptions (`InsufficientFundsException`) and guarding user interactions with `InputMismatchException` in an interactive ATM console.
* **Jagged Arrays**: Working with non-rectangular multidimensional arrays where rows possess varying numbers of columns.
* **Abstract Contracts**: Enforcing standard regulatory rules using abstract base classes (`RBI`).

---

## 💳 Payment System: Interface-Based Polymorphism (`Payment.java`)

Demonstrates how Java interfaces enable loose coupling and runtime polymorphism.

```java
interface PaymentMode {
    void payment();
}

class UPI implements PaymentMode {
    public void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6-digit UPI PIN:");
        if (sc.nextInt() == 123456) System.out.println("UPI Payment Successful!");
        else System.out.println("Wrong PIN. Payment Failed.");
    }
}

class Cash implements PaymentMode {
    public void payment() {
        System.out.println("Cash Payment Successful!");
    }
}

class Card implements PaymentMode {
    public void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4-digit Card PIN:");
        if (sc.nextInt() == 1234) System.out.println("Card Payment Successful!");
        else System.out.println("Wrong PIN. Payment Failed.");
    }
}
```

---

## 🛡️ ATM System: Custom Exceptions & Error Handling (`ATM.java` & `atmMain.java`)

### Custom Exception: `InsufficientFundsException`
Extending `java.lang.Exception` creates a **checked exception**, requiring explicit handling via `try-catch` or `throws`:

```java
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
```

### Robust ATM Controller (`atmMain.java`)
Handles both business exceptions and input formatting errors:
* `catch(InsufficientFundsException e)`: Displays user-friendly account error without crashing.
* `catch(InputMismatchException e)`: Handles non-numeric input gracefully and clears scanner buffer via `sc.next()`.

---

## 📊 2D Jagged Arrays in Java (`Jagged.java`)

In Java, a multidimensional array is essentially an array of array references. A **Jagged Array** (or Ragged Array) has rows of varying column lengths.

```java
public class Jagged {
    public static void main(String[] args) {
        // Row 0 has 2 elements, Row 1 has 3 elements
        int[][] arr = {{10, 20}, {30, 40, 50}};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

**Output:**
```text
10 20 
30 40 50 
```

---

## 🏛️ Abstract Classes: Banking Rules Engine (`Bank.java`)

Enforces minimum balance policies across commercial banking entities using the `RBI` abstract class contract.

---

## 🚀 Compilation & Execution Guide

```bash
cd Day_7
javac *.java

# Run Payment Demo
java Payment

# Run ATM Console Application
java atmMain

# Run Jagged Array Demo
java Jagged

# Run Bank Rules Demo
java Bank
```

---

<p align="center">
  <i>Documented with care by Ponguru Aasrith Sairam | UPS Full Stack Training</i>
</p>
