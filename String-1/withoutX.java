/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
*/
public String withoutX(String str) {
  int len = str.length();
  
  if (len>0) {
   
    if ((str.substring(0,1)).equals("x")) {
      
      if ((str.substring(len-1, len)).equals("x")) {
        
        if (len>1) {
          return str.substring(1, len-1);
        } else {
          return "";
        }

      } else {
        return str.substring(1, len);
      }
      
    } else if (str.substring(len-1, len).equals("x")) {
      return str.substring(0, len-1);
    } else {
      return str;
    }
    
  } else {
    return str;
  }

}