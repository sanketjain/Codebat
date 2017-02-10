/*
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
*/

public String lastChars(String a, String b) {
  int lena = a.length();
  int lenb = b.length();
  if (lena==0){
    if(lenb!=0){
    String bb = b.substring(lenb-1, lenb);
    return "@"+ bb;}
    else{
      return "@@";
    }
  } else if(lenb==0){
    String fa = a.substring(0,1);
    return fa+"@";
  } else {
    String fa = a.substring(0,1);
    String bb = b.substring(lenb-1, lenb);
    return fa+bb;
  }  
}

