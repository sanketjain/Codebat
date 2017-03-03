import java.io.*;
import java.util.*;

public class HalloweenParty {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long k;
        for(int i=0; i<t; i++){
            k = scan.nextInt();
            if(k%2==0){
                System.out.println( (k/2) * (k/2));
            } else {
                System.out.println( (k+1)*(k-1)/4 ) ;
            } 
        }
        
    }
}