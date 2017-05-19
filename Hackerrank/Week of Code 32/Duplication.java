import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Duplication {

    static String duplication(int x){
        // Complete this function
        String s = "0";
		int lengthOfS = s.length();

		while(lengthOfS < 1000) {

			String t = "";
		//	System.out.println("Length of s is: " + lengthOfS);

		//	System.out.println("Value of s before modification is: " + s);
		//	System.out.println("Value of t before modification is: " + t);
			for(int j=0; j<lengthOfS; j++){
				String sj = "" + s.charAt(j);
				int m = Integer.parseInt(sj);
				t = t + (1 - m) ;	
			}
		//	System.out.println("Value of t after modification is: " + t);
			s = s + t;
			lengthOfS = s.length();	
		//	System.out.println("Value of s after modification is: " + s);
		} 	
        //System.out.println("Value of s is: " + s);
        
        return ("" + s.charAt(x));
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            String result = duplication(x);
            System.out.println(result);
        }
    }
}
