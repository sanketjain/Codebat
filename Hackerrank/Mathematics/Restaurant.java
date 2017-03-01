import java.io.*;
import java.util.*;

public class Restaurant {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner in = new Scanner(System.in);
       int t = in.nextInt();
       for(int i=0; i<t; i++){
           int l = in.nextInt();
           int b = in.nextInt(); 
           int hcf = Restaurant.gcd(l, b); 
          // System.out.println(hcf);

           int reml = (l/hcf);
           int remb = (b/hcf);
           System.out.println(remb*reml);
       }
    }

	public static int gcd(int x, int y){
	  return (y == 0) ? x : gcd(y, x % y);
	}



}