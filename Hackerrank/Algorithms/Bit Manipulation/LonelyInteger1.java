import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger1 {
     private static int lonelyInteger(int[] a) {
        return Arrays.stream(a).reduce(0, (x,y) -> x^y);
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

//With Java 8, life is so easy. Lambda expressions
