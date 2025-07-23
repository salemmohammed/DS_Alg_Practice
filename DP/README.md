# DS_Alg_Practice

## Dynamic Programming (DP)

**Dynamic programming(DP)** is a common algorithm technique that breaks the problem into smaller and overlapping subproblems. The subproblem solution can be stored in a table to avoid re-computing it. Overall, DP is an optimization over recursion, and can be used when there a repeated calls for the same input.
There are two common approaches to implementing the DP called the memorization and tabulation approaches. Both are used when there an overlapping subproblems.

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

- **Top-Down (Memoization)**: Recursive + caching intermediate results [[See the Java Code](https://github.com/salemmohammed/DS_Alg_Practice/blob/main/Dynamic_Programming/Top_Down_DP.java)]
- **Bottom-Up**: Iterative table-filling [[See the Java Code](https://github.com/salemmohammed/DS_Alg_Practice/blob/main/Dynamic_Programming/BottomUP_DP.java)]



## Longest Common Subsequence (LCS)

**Given**:
- Two sequences (strings)

**Goal**:
- Find the **length** of the longest subsequence that appears in **both** sequences
- The subsequence need not be contiguous, but must maintain relative order

- **Bottom-Up and Top-Down**: [[See the Java Code](https://github.com/salemmohammed/DS_Alg_Practice/blob/main/Dynamic_Programming/LongestCommonSubsequence.java)]

### Example

```text
String A = "abcdaf"
String B = "acbcf"
LCS = "abcf" → Length = 4


## Subset sum Problem

**Given**:
- total and items

**Goal**:
- Find the **items** of the items list that can be equal or less than total.

- **Bottom-Up and Top-Down**: [[See the Java Code](https://github.com/salemmohammed/DS_Alg_Practice/blob/main/DP/SubsetSum.java)]

### Example

```text
Total 11
items = {2,3,5,8}
answer is 3 and 8
