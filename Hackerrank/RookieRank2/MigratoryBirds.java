import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        
        // your code goes here
        int[] g = {0, 0, 0, 0, 0};
        for (int x = 0; x<n; x++){
            switch(types[x]){
                case 1: g[0]++; break; 
                case 2: g[1]++; break;
                case 3: g[2]++; break;
                case 4: g[3]++; break;
                case 5: g[4]++; break;
            }
        }


        int max = 0;
        int yvalue = 0;

        for (int y=4; y>=0; y--){
            if(max<=g[y]){
                max = g[y];
                yvalue = y+1;
            }
        }

        System.out.println(yvalue);

    }
}
