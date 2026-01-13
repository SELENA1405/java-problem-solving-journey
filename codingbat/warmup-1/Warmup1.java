public class Warmup1 {

// =============================
//    1. SleepIn Problem
// =============================

//My Solution 
  public boolean sleepIn(boolean weekday, boolean vacation){
        if (!weekday || vacation){
            return true;
        } return false;
  } 

// =============================
//     2. monkeyTrouble
// =============================

//My Solution 
  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if (aSmile == bSmile){
      return true;
    } return false;
  }
  
// =============================
//       3. sumDouble
// =============================

//My Solution 
  public int sumDouble(int a, int b) {
  if (a == b) {
    return 2 * (a+b);
  } return a + b;
}
  
// =============================
//         4. diff21
// =============================

//My Solution 
  public int diff21(int n) {
  if (n > 21){
    return 2 * (n - 21);
  } else {
    return 21 - n;
  }
}
  
// =============================
//      5. parrotTrouble
// =============================

//My Solution 
  public boolean parrotTrouble(boolean talking, int hour) {
  if (talking == true && (hour < 7 || hour > 20)){
    return true;
  } return false;
}

// =============================
//       6. makes10
// =============================

//My Solution 
  public boolean makes10(int a, int b) {
  if ((a == 10 || b == 10) || (a+b) == 10) {
    return true;
  } return false;
}
  
// =============================
//       7. nearHundred
// =============================

//My Solution 
  public boolean nearHundred(int n) {
  if ((n >= 90 && n <= 110) || (n >= 190 && n <= 210) ){
    return true;
  } return false;
}
  
// =============================
//       8. posNeg
// =============================

//My Solution 
  public boolean posNeg(int a, int b, boolean negative) {
  return ((((a > 0 && b < 0) || ( a < 0 && b > 0)) && !negative ) || 
            ( a < 0 && b < 0 && negative )); 
}
  
// =============================
//       9. notString
// =============================

//My Solution 
  public String notString(String str) {
  if (str.startsWith("not")) {
    return str;
  } return "not " + str;
}

// =============================
//       10. missingChar
// =============================

//My Solution
  public String missingChar(String str, int n) {
  String last = str.substring(n+1);
  String first = str.substring(0, n);
  String result = first + last;
  return result;
}

// =============================
//       11. frontBack
// =============================

//My Solution 
  public String frontBack(String str) {
  char[] charArray = str.toCharArray();
  if (str.length() != 0){
  char temp = charArray[0]; 
  charArray[0] = charArray[str.length()-1];
  charArray[str.length()-1] = temp;
  }
  return new String(charArray);
}
  
// =============================
//       12. front3
// =============================

//My Solution 
  public String front3(String str) {
  if (str.length() <= 3){
     return str + str + str;
  } else if (str.length() > 3 ){
     return str.substring(0,3) + str.substring(0,3) + str.substring(0,3) ;
  } return str;
}

// =============================
//       13. backAround
// =============================

//My Solution 
  public String backAround(String str) {
  int lastIndex = str.length()-1;
  char last = str.charAt(lastIndex);
  return last + str + last;
}

// =============================
//       14. or35
// =============================

//My Solution 
  public boolean or35(int n) {
  if (n % 3 == 0 || n % 5 == 0){
    return true;
  } return false;
}

// =============================
//       15. front22
// =============================

//My Solution 
  public String front22(String str) {
  if (str.length() >= 2) {
    return str.substring(0,2) + str + str.substring(0,2);
  } return str + str + str;
}
  
// =============================
//       16. startHi
// =============================

//My Solution 
  public boolean startHi(String str) {
  if (str.length() < 2) {
    return false;
  } else if (str.substring(0,2).equals("hi")) {
    return true;
  } return false;
}

// =============================
//       17. icyHot
// =============================

//My Solution 
  public boolean icyHot(int temp1, int temp2) {
  return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
}
  
// =============================
//       18. in1020
// =============================

//My Solution 
  public boolean in1020(int a, int b) {
  return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
}
  
// =============================
//       19. hasTeen
// =============================

//My Solution 
  public boolean hasTeen(int a, int b, int c) {
  return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
}
  
// =============================
//       20. loneTeen
// =============================

//My Solution 
  public boolean loneTeen(int a, int b) {
  boolean aTeen = (a >= 13 && a <= 19);
  boolean bTeen = (b >= 13 && b <= 19);
  return (aTeen || bTeen) && (aTeen != bTeen);
}

// =============================
//       21. delDel
// =============================

//My Solution 
  public String delDel(String str) {
  if ((str.length() <= 3) ){
    return str;
  } else if(str.substring(1, 4).equals("del")){
    return str.substring(0,1) + str.substring(4, str.length());
  } return str;
}

// =============================
//       22. mixStart
// =============================

//My Solution 
  public boolean mixStart(String str) {
  if (str.length() <= 2) {
    return false;
  } return str.substring(1, 3).equals("ix");
}

// =============================
//       23. startOz
// =============================

//My Solution 
  public String startOz(String str) {
  if (str.length() < 2 && str.length() > 0 ){
    if (str.substring(0,1).equals("o")){
      return "o";
    } else {
      return "";
    }
  }
  if (str.length() >= 2) {
    if (str.substring(0,2).equals("oz")){
      return str.substring(0,2);
    } else if (str.substring(0, 1).equals("o")){
      return str.substring(0,1);
    } else if (str.substring(1,2).equals("z")) {
      return "z";
    }
  } return "";
}

// =============================
//       24. intMax
// =============================

//My Solution 
  public int intMax(int a, int b, int c) {
  if (c > b && c > a){
    return c;
  } else if (a > b && a > c){
    return a;
  } else if (b > a && b > c) {
    return b;
  } return a;
}

// =============================
//       25. close10
// =============================

//My Solution 
  public int close10(int a, int b) {
  if (Math.abs(a - 10) < Math.abs(b - 10)) {
    return a;
  }else if (Math.abs(a - 10) > Math.abs(b - 10)) {
    return b; 
  } return 0;
}
  
 //to be continued ...
  
} 


