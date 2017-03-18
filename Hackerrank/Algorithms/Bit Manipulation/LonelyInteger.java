import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {
     private static int lonelyInteger(int[] a) {
        Arrays.sort(a);
        int uniqueInt = 0;
        int len = a.length;
        if(len>1){
            for(int k=1; k<len; k++){
                if((a[k] ^ a[k-1])==0){ } 
                else { uniqueInt = a[k]; }
            }
        } else {
            uniqueInt = a[0];
        }
        return uniqueInt;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}

//This one gives error in a few test cases
