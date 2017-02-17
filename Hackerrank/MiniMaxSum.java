import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long[] arr = {a, b, c, d, e};
   		long maxsum = 0;
        long minsum = 0;
        Arrays.sort(arr);
        for(int i=0; i<((arr.length)-1); i++){
        	minsum = arr[i] + minsum;        	
        }
        System.out.print(minsum);
        for(int y = 1; y<arr.length; y++){
        	maxsum = maxsum + arr[y];
        }
        System.out.print(" ");
        System.out.println(maxsum);

    }
}
