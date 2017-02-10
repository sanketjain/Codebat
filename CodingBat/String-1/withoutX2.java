/*

Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"

*/

public String withoutX2(String str) {
  int len = str.length();
  
  if(len>1) {
  
    if(str.substring(0,1).equals("x")){
      
      if(str.substring(1,2).equals("x")){
        return str.substring(2,len);
      } else {
        return str.substring(1, len);
      }
      
    } else {
      
      if (str.substring(1,2).equals("x")) {
        return str.substring(0,1) + str.substring(2,len);
      } else {
      return str;
      }
      
    }
    
  } else {
    
      if(len>0 && (str.substring(0,1).equals("x"))){
        return str.substring(1, len);
      } else {
        return str;
      }
      
  }
  
}
