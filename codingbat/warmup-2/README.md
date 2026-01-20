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
