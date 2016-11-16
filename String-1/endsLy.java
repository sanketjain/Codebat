/*
Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
*/

public boolean endsLy(String str) {
  int len = str.length();

  if (len>=2){
    String lasttwo = str.substring((len-2), len);
    if(lasttwo == "ly"){
      System.out.println(lasttwo);
      return true;
    } else {
      return false;
    }
  } else {
    return false;
  }
}

public static void main{
	endLy("Sankly");
}
