import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        double n = scan.nextInt();
        int x, posCount=0, negCount=0, zeroCount=0;
        for(int i=0; i<n; i++){
            x = scan.nextInt();
            if (x>0){
                posCount++;
            } else if (x<0){
                negCount++;
            } else{
                zeroCount++;
            }
        }
        System.out.println(posCount/n);
        System.out.println(negCount/n);
        System.out.println(zeroCount/n);
    }
}