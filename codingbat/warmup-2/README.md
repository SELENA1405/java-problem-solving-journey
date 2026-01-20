# CodingBat Warmup-2 (Java)

This folder documents my solutions and learning progress
while solving the CodingBat Warmup-2 problems.

Note: There are 17 questions in total.

---

## 1. stringTimes
**Problem:**  
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

**Examples:**
- stringTimes("Hi", 2) → "HiHi"
- stringTimes("Hi", 3) → "HiHiHi"
- stringTimes("Hi", 1) → "Hi"
  
**Solution:**
```java
  public String stringTimes(String str, int n) {
  String result = "";
  for (int i = 0; i < n; i++){
    result += str;
  } return result;
}
```
---

## 2. frontTimes
**Problem:**  
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front.

**Examples:**
- frontTimes("Chocolate", 2) → "ChoCho"
- frontTimes("Chocolate", 3) → "ChoChoCho"
- frontTimes("Abc", 3) → "AbcAbcAbc"
  
**Solution:**
```java
  public String frontTimes(String str, int n) {
  String result = "";
  String temp ="";
  if (str.length() > 3){
    temp = str.substring(0, 3);
  } else if (str.length() <= 3){
    temp = str;
  }
  for (int i = 0; i < n; i++){
    result += temp;
  } return result;
}
```
---
