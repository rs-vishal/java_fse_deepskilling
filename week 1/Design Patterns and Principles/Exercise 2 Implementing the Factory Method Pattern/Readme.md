# FactoryMethodPatternExample

This Java project demonstrates the **Factory Method Design Pattern** using a document management system that supports creating different types of documents: **Word**, **PDF**, and **Excel**.

---

## 🧠 What is the Factory Method Pattern?

The **Factory Method Pattern** is a **creational design pattern** that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. It promotes loose coupling by delegating the responsibility of instantiating objects to subclasses.

This pattern is useful when:
- The exact type of the object to be created is determined at runtime.
- You want to localize the object creation logic.

---

## 📁 Project Structure
```bash
Exercise 2 Implementing the Factory Method Pattern/
├── Document.java
├── DocumentFactory.java
├── WordDocument.java
├── PdfDocument.java
├── ExcelDocument.java
├── WordDocumentFactory.java
├── PdfDocumentFactory.java
├── ExcelDocumentFactory.java
└── Main.java
```


## 🚀 How to Run

**Compile Java File**:
   ```bash
javac *.java
   ```

**Run the Application**:
```bash
    java Main
```

## ✅Sample Output:
```
Opening Word Document
Opening PDF Document
Opening Excel Document
```