//Minimum Absolute Difference in an Array

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AbsDifferenceSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // your code goes here

        int[] b = a;
        Arrays.sort(b);

        int newdiff, olddiff;
        olddiff = b[1] - b[0];

        for(int i=0; i<((b.length)-1); i++){
        	newdiff = Math.abs(b[i+1] - b[i]);
        	if(newdiff < olddiff){
        		olddiff = newdiff;
        	}
        }

        System.out.println(olddiff);
    }
}
