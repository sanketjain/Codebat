/*
Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
*/

public String right2(String str) {
 int len = str.length();
 String lasttwo = str.substring(len-2, len);
 String f = str.substring(0, len-2);
 return lasttwo+f;
}

