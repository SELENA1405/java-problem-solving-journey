public class String1 {

// =============================
//    1. helloName
// =============================

//My Solution 
  public String helloName(String name) {
  return "Hello " + name + "!";
}

// =============================
//    2. makeAbba
// =============================

//My Solution 
  public String makeAbba(String a, String b) {
  return a + b + b + a;
}

// =============================
//    3. makeTags
// =============================

//My Solution 
  public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}

// =============================
//    4. makeOutWord
// =============================

//My Solution 
  public String makeOutWord(String out, String word) {
  return out.substring(0, 2) + word + out.substring(2);
}

// =============================
//    5. extraEnd
// =============================

//My Solution 
  public String extraEnd(String str) {
  String end = str.substring(str.length()-2);
  return end + end + end;
}
  
  // to be continued ... 
  
}


