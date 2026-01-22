# CodingBat Warmup-1 (Java)

This folder documents my solutions and learning progress
while solving the CodingBat Warmup-1 problems.

Note: There are 31 questions in total. 

---

## 1. sleepIn
**Problem:**  
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

**Examples:**
- sleepIn(false, false) → true  
- sleepIn(true, false) → false  
- sleepIn(false, true) → true  

**Solution:**
```java
  public boolean sleepIn(boolean weekday, boolean vacation){
        if (!weekday || vacation){
            return true;
        } return false;
  }
```
---

## 2. monkeyTrouble
**Problem:**  
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

**Examples:**
- monkeyTrouble(true, true) → true
- monkeyTrouble(false, false) → true
- monkeyTrouble(true, false) → false

**Solution:** 
```java
  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if (aSmile == bSmile){
      return true;
    } return false;
  }
```
---

## 3. sumDouble
**Problem:**  
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

**Examples:**
- sumDouble(1, 2) → 3
- sumDouble(3, 2) → 5
- sumDouble(2, 2) → 8

**Solution:** 
```java
  public int sumDouble(int a, int b) {
  if (a == b) {
    return 2 * (a+b);
  } return a + b;
}
```
---

## 4. diff21
**Problem:**  
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

**Examples:**
- diff21(19) → 2
- diff21(10) → 11
- diff21(21) → 0

**Solution:** 
```java
 public int diff21(int n) {
  if (n > 21){
    return 2 * (n - 21);
  } else {
    return 21 - n;
  }
}
```
---

## 5. parrotTrouble
**Problem:**  
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

**Examples:**
- parrotTrouble(true, 6) → true
- parrotTrouble(true, 7) → false
- parrotTrouble(false, 6) → false
  
**Solution:** 
```java
 public boolean parrotTrouble(boolean talking, int hour) {
  if (talking == true && (hour < 7 || hour > 20)){
    return true;
  } return false;
}
```
---
