/*
Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.

extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
*/

public String extraFront(String str) {
  int len = str.length();
  
  if (len>=2){
    String sub = str.substring(0,2);
    return sub+sub+sub;
  } else if (len>0){
    String sub = str.substring(0,1);
    return sub+sub+sub;
  } else {
    return "";
  }
  
}
