/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
*/

public String firstHalf(String str) {
  int len = str.length();
  String firsthalf = str.substring(0, (len/2));
  return firsthalf;
}


