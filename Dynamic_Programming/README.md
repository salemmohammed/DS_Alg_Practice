# DS_Alg_Practice

## Dynamic Programming (DP)

**Dynamic Programming** is an optimization technique that solves complex problems by breaking them down into simpler subproblems and storing the results to avoid redundant computations.

One of the most famous problems solved with DP is the **0/1 Knapsack Problem**.

### 0/1 Knapsack Problem

Given:
- A set of items, each with a **value** and **weight**
- A knapsack with a maximum **capacity**

Goal:
- Maximize the total value of selected items
- Without exceeding the knapsack’s weight
- Each item can be included **at most once**

### DP Approaches

There are two common approaches to solving DP problems:

- **Top-Down (Memoization)**: Recursive + caching intermediate results [[See the Java Code] (https://github.com/salemmohammed/DS_Alg_Practice/blob/main/Dynamic_Programming/Top_Down_DP.java)]
- **Bottom-Up (Tabulation)**: Iterative table-filling [[See the Java Code](https://github.com/salemmohammed/DS_Alg_Practice/blob/main/Dynamic_Programming/BottomUP_DP.java)]
