/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
*/

public boolean lastDigit(int a, int b, int c) {
  int lasta = a%10;
  int lastb = b%10;
  int lastc = c%10;
  
  if ((lasta==lastb) || (lastb==lastc) || (lasta==lastc)) {
    return true;
  } else {
    return false;
  }
  
}
