import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RangeModularQueries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        for(int a0 = 0; a0 < q; a0++){
            int left = in.nextInt();
            int right = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            // your code goes here
            int count = 0;
            for(int i=left; i<=right; i++){
                if((a[i] % x) == y){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
