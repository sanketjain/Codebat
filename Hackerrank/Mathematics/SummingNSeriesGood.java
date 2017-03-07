import java.io.*;
import java.util.*;
//Awesome example to check if input can be modified to speed up
public class SummingNSeriesGood {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long n;
        long tn;
        long sumN;
        long maxPow = (long)(Math.pow(10, 9)) + 7L ;
        
        //Run test cases
        for(int i=0; i<t; i++){ //Do not disturb this one
            n = in.nextLong();
            n = n%maxPow;
            sumN = n*n;
            
            System.out.println(sumN % maxPow);
        }        
    }
}