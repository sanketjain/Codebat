/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
*/

public String minCat(String a, String b) {
  int lena = a.length();
  int lenb = b.length();
  
  if (lena==lenb){
    return a+b;
  } else if(lena>lenb){
    int lendiff = lena-lenb;
    String asub = a.substring(lendiff, lena);
    return asub+b;
  } else {
    int lendiff = lenb-lena;
    String bsub = b.substring(lendiff, lenb);
    return a+bsub;
  }
}
