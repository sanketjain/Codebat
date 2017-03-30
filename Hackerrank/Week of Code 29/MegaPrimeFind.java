import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MegaPrimeFind {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long first = in.nextLong();
        long last = in.nextLong();
        // your code goes here

        long value;
        long count = 0;
        for (value=first; value<=last; value++){
        	String checkvalueStr = Long.toString(value);
      	  	if(!containsNonPrimeDigits(checkvalueStr)){
      	  		if(isPrime(value)){
	        		//System.out.println("True " + value  + " is eligible to check Mega Prime");
	        		//Write code to check indivisual digits are prime:
	        		count = count + 1;
	          	}
      	  	}
        }
        System.out.println(count);
    }


    public static boolean containsNonPrimeDigits(String checkString){
 	  	String[] nonPrimeDigits = new String[] {"0", "1", "4", "6", "8", "9"};
	  	boolean found = false;
		for (String s : nonPrimeDigits) {
			if (checkString.contains(s)) {
				found = true;
				break;
			}
		}
		return found;
    }


    public static boolean isPrime(long n) {
	    long i;
	    for (i = 2; i < n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

}
