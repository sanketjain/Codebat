import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }

        // your code goes here
        int i=0;
		BigInteger[] series = new BigInteger[n];
		
		for(String x: unsorted){
        	//System.out.println(x);
        	series[i] = new BigInteger(x);
        	i++;
        }

        Arrays.sort(series);

        for (BigInteger y: series){
        	System.out.println(y);
        }


        
        
    }
}
