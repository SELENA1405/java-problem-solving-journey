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

// =============================
//       6. stringSplosion
// =============================

//My Solution 
  public String stringSplosion(String str) {
  String result ="";
  for (int i = 0; i < str.length(); i++){
    result += str.substring(0, i+1);
  } return result;
}

// =============================
//       7. last2
// =============================

//My Solution 
  public int last2(String str) {
  int count = 0;
  if (str.length() <=2) { return 0; }
  String last = str.substring(str.length()-2, str.length());
  for (int i = 0; i < str.length()-2; i ++){
    if (str.substring(i, i+2).equals(last)){
      count++;
    }
  }return count;
}

// =============================
//       8. arrayCount9
// =============================

//My Solution 
  public int arrayCount9(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++){
    if (nums[i] == 9) count++;
  } return count;
}

// =============================
//       9. arrayFront9
// =============================

//My Solution
  public boolean arrayFront9(int[] nums) {
  int limit = 4;
  for (int i = 0; i < nums.length && i < limit; i ++){
    if (nums[i] == 9) return true;
  } return false;
}

// =============================
//       10. array123
// =============================

//My Solution 
  public boolean array123(int[] nums) {
  for (int i = 0; i < nums.length-2; i++){
    if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
  } return false;
}

// to be continued ...
  
}
