import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CandyReplenishingRobot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
       
        // your code goes here
        int biEnd = n;
        int candiesAdded = 0;
        for(int i=0; i<t; i++){
            biEnd = biEnd - c[i];
         //   System.out.println("biEnd = " + biEnd);
            if(biEnd<5 && (i<(t-1))){
                candiesAdded = n - biEnd + candiesAdded;
                biEnd = n;
       //         System.out.println("candiesAdded " + candiesAdded);
            }            
        }
        System.out.println(candiesAdded);

    }
}
