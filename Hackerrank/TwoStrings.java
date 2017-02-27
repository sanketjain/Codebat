import java.io.*;
import java.util.*;

public class TwoStrings{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       String a, b;
       String yn = "NO";
   
       for(int i=0; i < (2*n); i=i+2){
           a = in.next();
           b = in.next();
           FOROUTER: for(int j=0; j<a.length(); j++){
           		String aj = String.valueOf(a.charAt(j));
           		if(b.contains(aj)){
           			yn = "YES";
           			break FOROUTER;
           		} else {
           			yn = "NO";
           		}
           }
           System.out.println(yn); 
       } 

    }
}


//This is not able to clear Test Case 5 and 6. 