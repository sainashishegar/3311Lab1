# 🧪 JML Object Contracts Lab – 3311Lab1

This project demonstrates the use of **Java Modeling Language (JML)** contract specifications in object-oriented Java classes. The lab focuses on building and testing simple Java classes like `Person` and `SodaCan` while incorporating formal **pre-conditions** and **post-conditions** using JML-style comments to ensure software correctness.

---

## 📁 Project Structure

```
src/lab02/
├── Person.java          # A class representing a person with testable attributes
├── PersonTest.java      # Unit tests for Person class
├── SodaCan.java         # A class representing a soda can with volume calculations
├── SodaCanTest.java     # Unit tests for SodaCan class
├── Scenario.java        # A demo class that runs specific test cases or scenarios
```

---

## 🔍 Features

- JML-style contracts on key methods for correctness guarantees
- Encapsulation of object behavior (height, weight, volume, etc.)
- Includes unit tests to validate class logic
- Uses Java assertions and object equality logic

---

## 💡 Examples of Design-by-Contract

```java
// Example from Person.java
//@ requires height >= 0;
//@ ensures this.height == height;
public void setHeight(double height) {
    this.height = height;
}
```

```java
// Example from SodaCan.java
//@ ensures \result == Math.PI * radius * radius * height;
public double getVolume() {
    return Math.PI * radius * radius * height;
}
```

---

## 🛠️ Tech Stack

- Java  
- JML (Java Modeling Language) – contract-style annotations  
- JUnit or custom test classes for validation  

---

## 🚀 How to Run

1. Compile all files in `src/lab02/`:
   ```bash
   javac src/la
