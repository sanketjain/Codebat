/*
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
*/

public String middleThree(String str) {
  int len = str.length();
  if (len>3){
    int extralen = len-3;
    int fex = extralen/2;
    return str.substring(fex, len-fex);
  }else{
    return str;
  }
}
