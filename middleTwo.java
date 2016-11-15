/*
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
*/

public String middleTwo(String str) {
  int len = str.length();
  String midtwo = str.substring(len/2-1, len/2+1);
  return midtwo;
}
