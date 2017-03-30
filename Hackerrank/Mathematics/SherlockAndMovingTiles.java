import java.io.*;
import java.util.*;

public class SherlockAndMovingTiles {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int s1 = in.nextInt();
        int s2 = in.nextInt();
        int Q = in.nextInt();
        double timeT;
        
        for(int i=0; i<Q; i++){
            int area = in.nextInt();
            double firstterm = Math.sqrt(2 * area);
            double secondterm = L * (Math.sqrt(2));
            timeT = (secondterm-firstterm) / (s2-s1) ;
            System.out.println(timeT);
        }
       
    }
}