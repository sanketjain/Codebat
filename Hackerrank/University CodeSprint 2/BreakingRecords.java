import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }

        // your code goes here
 //       int[] compare = score;
        int bestRecord = score[0];
        int worstRecord = score[0];
        int brokeBestCount = 0;
        int brokeWorstCount = 0;

        for(int c: score){
        	if(c>bestRecord){
        		brokeBestCount = brokeBestCount + 1;
        		bestRecord = c;
        	} else if(c<worstRecord){
        		brokeWorstCount = brokeWorstCount + 1;
        		worstRecord = c;
        	}
        }

        System.out.println(brokeBestCount + " " + brokeWorstCount);



    }
}
