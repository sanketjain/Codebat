/*
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
*/

public String nonStart(String a, String b) {
  int lena = a.length();
  int lenb = b.length();
  String parta = a.substring(1, lena);
  String partb = b.substring(1, lenb);
  return parta+partb;
}

