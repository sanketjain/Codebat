/*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).

factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
*/

public int factorial(int n) {
  int prod = 1;
  while (n>=1){
    prod = prod*n;
    n=n-1;
    factorial(n);
  }
  return prod;
}
