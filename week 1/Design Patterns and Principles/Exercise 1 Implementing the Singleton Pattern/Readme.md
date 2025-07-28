# 🧩 SingletonPatternExample

A simple Java implementation of the **Singleton Design Pattern**, ensuring that only one instance of a logging utility exists throughout the application lifecycle.

---

## 📌 What is the Singleton Pattern?

The **Singleton Pattern** is a creational design pattern that ensures a class has only **one instance** and provides a global point of access to that instance.



## 📂 Project Structure

```bash
Exercise 1: Implementing the Singleton Pattern/
├── Logger.java    # Singleton Logger class
└── Main.java      # Demonstration and testing of Logger behavior
```

## 🚀 How to Run

**Compile Java File**:
   ```bash
   javac Logger.java Main.java
   ```

**Run the Application**:
```bash
    java Main
```



## ✅Sample Output:
```
Logger initialized
Log: This is the first log message.
Log: This is the second log message.
Both logger1 and logger2 are the same instance.
```