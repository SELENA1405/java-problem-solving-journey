# CodingBat Warmup-1 (Java)

This folder documents my solutions and learning progress
while solving the CodingBat Warmup-1 problems.

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

