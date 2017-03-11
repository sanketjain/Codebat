import java.io.*;
import java.util.*;
public class RussianPeasantAlgorithm {
    public static void main(String[] args) {
        /* Enter your code here */
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int i=0; i<q; i++){ //Take one test case at a time
            int a = scan.nextInt();
            int b = scan.nextInt();
            long k = scan.nextInt();
            int m = scan.nextInt();             

            long valueOfK = k;
            //Find maximum power of 2 which is less than k
            int maxPower = 0; 
            while(valueOfK>1){
                maxPower = maxPower + 1;
                valueOfK = valueOfK/2;
                System.out.println(valueOfK+" maxPower "+maxPower);
            }

            int powerC=a, powerD=b, tempC;
            for(int j=0; j<maxPower; j++){
                tempC = powerC;
                powerC = (powerC*powerC - powerD*powerD);
                powerD = 2*powerD*tempC;
                System.out.println(powerC + " and d is "+ powerD);
            }

            if(k=0){
                System.out.println(1);
                System.out.println(0);
            }


        }       
    }



}