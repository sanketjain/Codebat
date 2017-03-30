//Need to update this code. Currently under work

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindLargestPrime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();

            //CODE FROM HERE

            for (long i=1; i<=n; i++){
                if(n%i==0){
                    System.out.println(i);
                    
                }
            }
        }
   
    }
}
