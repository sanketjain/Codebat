import java.io.*;
import java.util.*;

public class Solution {
    static int maxcount = 0;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long givenInt=0;

        for(int i=0; i<n; i++){
        	givenInt = in.nextLong();
        	for (long z=0; z<givenInt; z++){
        		Solution.testInt(z);
        	}
        	System.out.println(Solution.maxcount);
        }

        
       
    }

    


    public static void testInt(long testinteger){
    	int count = 0;

        for(long j=2; j<testinteger; j++){
        	if((testinteger%j)==0){
        		// System.out.println(j + "is factor of " + givenInt);
        		if(Solution.isPrime(j)){
        			//System.out.println(j + " is Prime factor of " + testinteger);
        			count = count + 1;
        		}
        	}
        }
        if(count!=0){
	        //System.out.println(count);
	        if(Solution.maxcount<count){
	        	Solution.maxcount = count;
	        }
        }
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