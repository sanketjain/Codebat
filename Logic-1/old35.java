/*
Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod

old35(3) → true
old35(10) → true
old35(15) → false
*/


public boolean old35(int n) {
  
  int mod3 = n%3;
  int mod5 = n%5;
  
  if (mod3==0 && mod5==0){
    return false;
  } else if (mod3==0 || mod5==0){
    return true;
  } else {
    return false;
  }
  
}

