import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EulerMultiples {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            BigInteger sum = new BigInteger("0");

            for(int i=0; i<n; i++) {
                if (((i%3)==0) && ((i%5)==0)){
                    sum = sum.add(BigInteger.valueOf(i));
                } else if((i%3)==0){
                    sum = sum.add(BigInteger.valueOf(i));
                } else if((i%5)==0){
                    sum = sum.add(BigInteger.valueOf(i));
                }
            }
                System.out.println(sum);                
        }
    }
}
