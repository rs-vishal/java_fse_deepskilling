# E-commerce Platform Search Function

This project implements a basic product search functionality for an e-commerce platform using Java. It includes classes for product definition and searching products by different attributes.

## 📌 Scenario

You are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance.   

---
## ✅ Exercise Steps

### 1. Understand Asymptotic Notation

* **Big O Notation** is used to describe the **time complexity** (performance) of an algorithm in terms of input size `n`.

* Helps developers predict how the algorithm will scale as the dataset grows.

| Case       | Linear Search | Binary Search |
| ---------- | ------------- | ------------- |
| Best Case  | O(1)          | O(1)          |
| Average    | O(n)          | O(log n)      |
| Worst Case | O(n)          | O(log n)      |

---

### 2.Setup
Created a class `Product` with the following attributes:

* `productId`: Unique identifier
* `productName`: Name of the product (used for searching)
* `category`: Category of the product

---

### 3.	Implementation
Implemeting  linear search and binary search algorithms:

### 🔹 Linear Search
Linear Search is a basic search algorithm that checks each element in the list one by one until the target element is found or the end of the list is reached.

- ✅ Works on unsorted and sorted lists  
- 🕒 Time Complexity: O(n)

### 🔹 Binary Search
Binary Search is an efficient algorithm that works only on sorted lists. It repeatedly divides the list in half to find the target element.

- ⚠️ Requires the list to be sorted  
- ⚡ Much faster than linear search for large datasets  
- 🕒 Time Complexity: O(log n)


### 4. Analysis

#### 🔸 Time Complexity

| Search Type   | Time Complexity | Requires Sorting? | Suitable for Large Data |
| ------------- | --------------- | ----------------- | ----------------------- |
| Linear Search | O(n)            | ❌ No              | ❌ No                    |
| Binary Search | O(log n)        | ✅ Yes             | ✅ Yes                   |

### ✅ Suitable Algorithm: **Binary Search**

**Reason:**  

It offers logarithmic time complexity (O(log n)), making it highly efficient compared to Linear Search, which has linear time complexity (O(n)).

---
## 🗂 Project Structure
```bash
Algorithms_Data_Structures/
│
├── Product.java 
├── Main.java 
└── README.md 
```


## ✅ Features

- Define products with `ProductID`, `ProductName`, and `Category`
- Search for products by name or category
- Simple console-based interface for input/output

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
Liner Search
ProductID: 6, ProductName: Jeans, Category: Clothing
Binary Search
ProductID: 6, ProductName: Jeans, Category: Clothing
```
