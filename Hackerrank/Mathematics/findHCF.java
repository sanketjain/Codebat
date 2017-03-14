import java.io.*;
import java.util.*;

public class findHCF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */      
        int l = 10;
        int b = 99;  
        int hcf = 1;
        int largestStart;

        if(l>=b){
        	largestStart = b;
        } else {
        	largestStart = l;
        }

        System.out.println("largestStart is " + largestStart);

        OUTERLOOP: for(int j=largestStart; j>0; j--){
        	if(((l%j)==0) && ((b%j)==0)){
        		System.out.println(b%j + " b is " + b + " j is " + j);
        		hcf = largestStart;
        		System.out.println(hcf);
        		break OUTERLOOP;
        	}
        }
        System.out.println(hcf);
    }        
}