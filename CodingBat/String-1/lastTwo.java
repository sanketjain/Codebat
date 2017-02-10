/*
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
*/

public String lastTwo(String str) {
  int len = str.length();
  String rem;
  if (len > 1){
    String lasta = str.substring((len-1), len);
    String seclasta = str.substring((len-2), (len-1));
    if(len>2) {rem = str.substring(0, len-2);} 
    else {rem = "";}
    return rem+lasta+seclasta;
  } else {
    return str;
  }
}
