import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        // your code goes here
        
        
        int i=0;
		int[] arr = new int[n];
        for(String x: unsorted){
        	//System.out.println(x);
        	arr[i] = Integer.parseInt(x);
        	i++;
        }

        Arrays.sort(arr);
        for(int y: arr){
        	System.out.println(y);
        }
    }
}
