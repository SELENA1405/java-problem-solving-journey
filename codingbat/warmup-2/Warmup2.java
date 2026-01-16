public class Warmup2 {

// =============================
//       1. stringTimes
// =============================

//My Solution 
  public String stringTimes(String str, int n) {
  String result = "";
  for (int i = 0; i < n; i++){
    result += str;
  } return result;
}

// =============================
//       2. frontTimes
// =============================

//My Solution 
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

// =============================
//       3. countXX
// =============================

//My Solution 
  int countXX(String str) {
  int count = 0;
  for (int i = 0; i < str.length()-1; i ++) {
    if ((str.charAt(i) == 'x') && (str.charAt(i+1) == 'x')){ 
      count ++; 
    }
  } return count;
}

// =============================
//       4. doubleX
// =============================

//My Solution
  boolean doubleX(String str) {
  for (int i = 0; i < str.length()-1; i ++) {
    if (str.charAt(i) == 'x') {
      if (str.charAt(i + 1) == 'x'){
      return true;
      } break;
    } 
  } return false;
}

// =============================
//       5. stringBits
// =============================

//My Solution 
  public String stringBits(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i++){
    if (i % 2 == 0){
      result += str.charAt(i);
    } 
  } return result;
}

// to be continued ...
  
}
