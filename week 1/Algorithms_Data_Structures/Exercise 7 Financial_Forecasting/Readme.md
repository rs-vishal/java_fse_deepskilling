
# 💸 Exercise 7: Financial Forecasting

This Excercise demonstrates how to use **recursive algorithms** in Java to forecast future financial values based on past data and a constant growth rate. It also includes an **optimized version** using memoization to avoid redundant computations.

---

## 📚 Scenario

You're building a **financial forecasting tool** that predicts future investment values given an initial amount, annual growth rate, and number of years into the future. The forecasting algorithm uses recursion for calculation.

---

## ✅ Steps Completed

### 1. Understand Recursive Algorithms

Recursion is a technique in which a function calls itself to solve smaller instances of a problem. It is useful for simplifying problems like calculating compounded financial values, where the value for each year depends on that of the previous year.

### 2. Setup

A method is created to calculate future investment value using:
- `presentValue` — the initial amount
- `interestRate` — annual growth rate (as a decimal)
- `years` — the number of years for forecasting

### 3. Implementation

Two forecasting methods are implemented:
- `calculateFutureValue()` — basic recursive implementation
- `calculateFutureValueMemo()` — optimized using **memoization** to cache results

### 4. Analysis

#### ⌛Time Complexity

| Method                   | Time Complexity | Space Complexity |
|--------------------------|------------------|------------------|
| Basic Recursive          | O(n)             | O(n) (stack)     |
| Memoized Recursive       | O(n)             | O(n) (array)     |

Memoization significantly reduces redundant calculations and improves performance.

---

## ✅Sample Output

```bash
Future Value using recursion: 8144.47
Future Value using memo : 8144.47
````

This result is for:

* Principal = 5000
* Rate = 5% (0.05)
* Years = 10

---

## ▶️ How to Run

1. **Compile**

   ```bash
   javac *.java
   ```

2. **Run**

   ```bash
   java FinancialForecasting.java
   ```

---

