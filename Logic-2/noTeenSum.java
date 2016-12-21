public int noTeenSum(int a, int b, int c) {
  int ax = fixTeen(a);
  int bx = fixTeen(b);
  int cx = fixTeen(c);
  return ax+bx+cx;
}

public int fixTeen(int n){
  int x;
  if (n!=15 && n!=16){
    if (n>=13 && n<=19){
      x = 0;
    }
    else {
      x = n;
    }
  } else {
    x=n;
  }
  return x;
}