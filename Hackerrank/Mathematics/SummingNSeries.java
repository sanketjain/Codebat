import java.io.*;
import java.util.*;

public class SummingNSeries {

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
            sumN = 0;

            for(long j=1; j<=n; j++){
                tn = (j*j) - ((j-1)*(j-1));              
                sumN = tn + sumN; 
                if(sumN>(maxPow)){
                    sumN = sumN % maxPow; 
                }
            }
            System.out.println(sumN % maxPow);
        }        
    }
}