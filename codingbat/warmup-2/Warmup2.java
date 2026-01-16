public class Warmup2 {

// =============================
//    1. stringTimes
// =============================

//My Solution 
  public String stringTimes(String str, int n) {
  String result = "";
  for (int i = 0; i < n; i++){
    result += str;
  } return result;
}

// =============================
//    2. frontTimes
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
//    3. 
// =============================

// =============================
//    4. 
// =============================

// =============================
//    5.
// =============================


}
