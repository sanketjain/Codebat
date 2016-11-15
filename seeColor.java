/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
*/

public String seeColor(String str) {
  int len = str.length();
  String r = "red";
  String b = "blue";
  if (len>3) {
    if (str.substring(0,4).equals("blue")){
      return b;
    } else if (str.substring(0,3).equals("red")){
      return r;
    } else {
      return "";
    }
  } else if (len>2 && (str.substring(0,3)=="red")){
      return r;
  } else {
    return "";
  }
}
