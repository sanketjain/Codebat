/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
*/

public boolean frontAgain(String str) {
  int len = str.length();
  
  if (len>2){
    String f2 = str.substring(0,2);
    if (len>3){
      String b2 = str.substring(len-2, len);
      if (f2.equals(b2)){
        return true;
      } else {  return false;  }
    } else { 
      String b2 = str.substring(len-2, len);
      if (f2.equals(b2)){  return true; } 
      else {  return false; }
    }
  } else if(len>1) {  return true;  }
  else { return false; }
}
