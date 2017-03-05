import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheHurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        // your code goes here

        int max = 0;
        for(int h: height){
            if(max < h){
                max = h;
            }            
        }

        if(max>k){
            System.out.println(max-k);
        } else {
            System.out.println(0);
        }

    }
}
