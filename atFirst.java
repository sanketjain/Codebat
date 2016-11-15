/*
Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.

atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
*/

public String atFirst(String str) {
  int len = str.length();
  if (len<2){
    if(len<1){
      return "@@";
    } else {
      return str+"@";
    }
  } else {
    return str.substring(0,2);
  }
}
