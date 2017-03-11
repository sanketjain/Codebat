import java.io.*;
import java.util.*;
public class TrialRussian {
    public static void main(String[] args) {
        /* Enter your code here */
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int i=0; i<q; i++){ //Take one test case at a time
            int a = scan.nextInt();
            int b = scan.nextInt();
            long k = scan.nextInt();
            int m = scan.nextInt();      
            long c, d;       

            if(b==0){
                System.out.println(TrialRussian.RPMethod(a, k) + " " + 0);
            } else if(a==0){
                TrialRussian.RPMethod(b, k);
                if((b%2)!=0){

                } else if((b%4)!=0) {
                    System.out.println((-1*TrialRussian.RPMethod(b, k)) + " " + 0);
                } else {
                    System.out.println((TrialRussian.RPMethod(b, k)) + " " + 0);
                }
            }

        }   
    }

    public static long RPMethod(long valueA, long valueK){
        double nDouble = (Math.log(valueK)) / (Math.log(2));
        int nInt = (int)nDouble;
        //System.out.println(valueK+" n is "+nDouble+" " + nInt);
        long startingValueA = valueA;
        for(int x=0; x<nInt; x++){
            valueA = valueA * valueA;
        }
        long finalValueA = valueA * (startingValueA*(valueK - (int)(Math.pow(2, nInt))));
        return finalValueA;
    }


}