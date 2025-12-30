# CSE1133 Exam Practice Questions

This document contains a collection of practice scenarios and coding questions covering arrays, methods, loops, string manipulation, and logic algorithms.

---

## Part 1: Comprehensive Scenarios

### Scenario 1: Library Automation System

The following table shows the data for books in a library, including **Book ID**, **Page Count**, and **Type Code** (0: Novel, 1: Science, 2: History).

| Book ID | Page Count | Type Code |
| :--- | :--- | :--- |
| 101 | 320 | 0 |
| 102 | 150 | 1 |
| 103 | 450 | 2 |
| 104 | 200 | 0 |
| 105 | 600 | 1 |

**Requirements:**

1.  **a) Array Initialization:** Declare and initialize a 2D integer array named `books` to store the data shown in the table.
2.  **b) Display Method:** Write a method named `displayLibrary(int[][] list)`.
    * It should display the details of the books.
    * Convert the **Type Code** to text: Print "Novel" for 0, "Science" for 1, and "History" for 2.
3.  **c) Calculation Method:** Write a method named `calculateReadingTime(int[][] list)`.
    * Assume a person reads **40 pages per hour**.
    * Calculate the estimated reading time (in hours) for each book.
    * **Return** these values as a `double[]` array.
4.  **d) Logic Method:** Write a method named `findThickest(int[][] list)`.
    * Find the book with the maximum number of pages.
    * Print the **Book ID** and **Page Count** of that book to the console.
5.  **e) Main Method:** In the `main` method, create the array, call the methods, and display the results properly.

---

### Scenario 2: Factory Production Line

The following table shows daily production data for 5 machines: **Machine No**, **Production Volume**, and **Defective Count**.

| Machine No | Production (Qty) | Defective (Qty) |
| :--- | :--- | :--- |
| 1 | 1000 | 50 |
| 2 | 1200 | 120 |
| 3 | 900 | 10 |
| 4 | 1500 | 300 |
| 5 | 1100 | 55 |

**Requirements:**

1.  **a) Array Initialization:** Declare and initialize a 2D integer array named `production` with the given values.
2.  **b) Calculation Method:** Write a method named `calculateErrorRate(int[][] list)`.
    * Calculate the **Error Rate** percentage for each machine.
    * Formula: `(Defective Count / Production Volume) * 100`
    * **Return** the rates as a `double[]` array. *(Hint: Watch out for integer division!)*
3.  **c) Audit Method:** Write a method named `auditMachines(double[] rates, int[][] list)`.
    * Check the calculated rates.
    * If a machine's error rate is **greater than 10%**, print its **Machine No** and the message **"NEEDS MAINTENANCE"**.
4.  **d) Update Method:** Write a method named `updateTargets(int[][] list)`.
    * Identify machines with a **Defective Count less than 20**.
    * Increase the **Production Volume** (target) of these machines by **20%**.
    * Update the `production` array directly.
5.  **e) Main Method:** In the `main` method, execute the workflow: create data, calculate rates, audit machines, update targets, and print the final state of the production targets.

---

## Part 2: Algorithmic Logic & String Operations

**1. Clock Angle Calculator**
Write a program that takes a digitally entered time (Hour and Minute) and calculates the smaller angle between the hour hand and the minute hand of an analog clock.

**2. Most Frequent Character**
Write a function that takes an array of size 200 (or a large string) and finds the character that appears the most frequently.




**3. Case Swapping by Index**
Write a program that iterates through a character array or string:
* At **Odd Indices**: If the character is Uppercase, convert it to Lowercase.
* At **Even Indices**: If the character is Lowercase, convert it to Uppercase.

---

## Part 3: Midterm Review & Core Concepts

**1. Reverse Loop with Conditions**
Using a `while` loop, write a program that prints numbers starting from 200 down to 0. Only print numbers that are divisible by **both 5 and 7**.

**2. Consecutive Sequence Search**
Write a program that:
* Accepts 100 digits (0-9) entered by the user and stores them in an array.
* Counts how many times the sequence **5, 3, 8** appears consecutively in that order.

**3. Prime Number Statistics**
Write a program that keeps asking the user for numbers until a negative number is entered. Once finished, calculate and print the **Sum** and **Average** of only the **Prime numbers** entered.

**4. Matrix Transpose**
Write a program that creates a 5x5 matrix named `matA` using user input. Then, create a new matrix named `matB` which is the **transpose** of `matA` (rows become columns).

**5. Polynomial Function**
Write a method/function that takes an integer `x` as input and calculates the result of the following polynomial:
$$3x^2 + 5x + 2$$