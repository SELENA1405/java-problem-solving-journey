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
  
}

