# CodingBat String-1 (Java)

This folder documents my solutions and learning progress
while solving the CodingBat String-1 problems.

Note: There are 33 questions in total. 

---

## 1. helloName
**Problem:**  
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

**Examples:**
- helloName("Bob") → "Hello Bob!"
- helloName("Alice") → "Hello Alice!"
- helloName("X") → "Hello X!"

**Solution:**
```java
  public String helloName(String name) {
  return "Hello " + name + "!";
}
```
---

## 2. makeAbba
**Problem:**  
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

**Examples:**
- makeAbba("Hi", "Bye") → "HiByeByeHi"
- makeAbba("Yo", "Alice") → "YoAliceAliceYo"
- makeAbba("What", "Up") → "WhatUpUpWhat"

**Solution:**
```java
  public String makeAbba(String a, String b) {
  return a + b + b + a;
}
```
---
