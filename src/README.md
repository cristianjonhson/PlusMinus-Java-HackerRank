# Plus Minus - Java Implementation

This is a solution for the **Plus Minus** challenge from HackerRank. The program calculates the proportion of positive, negative, and zero elements in a given array and prints the results up to six decimal places.

## Problem Description

Given an array of integers, calculate the following ratios:
- The ratio of positive numbers.
- The ratio of negative numbers.
- The ratio of zeros.

Each value must be printed on a new line, formatted to **6 decimal places**.

### Input Format
1. The first line contains an integer, `n`, the size of the array.
2. The second line contains `n` space-separated integers representing the array elements.

### Output Format
Print the ratios of positive, negative, and zero elements, each on a new line, with **6 decimal places**.

### Example Input
```
6
-4 3 -9 0 4 1
```

### Example Output
```
0.500000
0.333333
0.166667
```

### Constraints
- `0 < n ≤ 100`
- `-100 ≤ arr[i] ≤ 100`

---

## How to Run

### Prerequisites
- Java Development Kit (JDK) 17 or later.
- A Java IDE or terminal with Java installed.

### Steps
1. Clone or download this repository.
2. Compile the Java program:
   ```
   javac Main.java
   ```
3. Run the program:
   ```
   java Main
   ```
4. Provide input as described in the problem description.

### Sample Run
**Input:**
```
6
0 -67 -74 -38 -72 -53
```

**Output:**
```
0.000000
1.000000
0.000000
```

---

## Code Explanation

### Main.java
The program consists of:
- A `countNumbers` method:
    - Loops through the array to count positive, negative, and zero elements.
    - Calculates the ratios and prints them formatted to 6 decimal places.
- The `main` method:
    - Reads input values using `Scanner`.
    - Passes the array to the `countNumbers` method.

### Key Features
- Handles edge cases, such as all elements being zeros.
- Formats output to six decimal places using `String.format`.

---

## Example Scenarios

1. **All Positive:**
   Input:
   ```
   5
   1 2 3 4 5
   ```
   Output:
   ```
   1.000000
   0.000000
   0.000000
   ```

2. **Mixed Values:**
   Input:
   ```
   6
   -1 1 0 -3 2 0
   ```
   Output:
   ```
   0.333333
   0.333333
   0.333333
   ```

---

## License
This project is open-source and free to use under the MIT License.

---