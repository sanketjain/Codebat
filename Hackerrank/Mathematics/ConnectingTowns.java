import java.io.*;
import java.util.*;

public class ConnectingTowns {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        //Run t times
        for(int i=0; i<t; i++){
            long mul = 1;
            int n = in.nextInt();       

            for(int j=0; j<(n-1); j++){
                int nj = in.nextInt();
                mul = mul*nj;
                if(mul>1234567){
                    mul = mul%1234567;
                }
            }
            System.out.println(mul%1234567);
        }            
    }
}