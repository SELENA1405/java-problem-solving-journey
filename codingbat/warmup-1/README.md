# CodingBat Warmup-1 (Java)

This folder documents my solutions and learning progress
while solving the CodingBat Warmup-1 problems.

---

## sleepIn
**Problem:**  
We sleep in if it is not a weekday or we're on vacation.

**Examples:**
- sleepIn(false, false) → true  
- sleepIn(true, false) → false  
- sleepIn(false, true) → true  

**Solution:**
```java
public boolean sleepIn(boolean weekday, boolean vacation) {
    return !weekday || vacation;
}
