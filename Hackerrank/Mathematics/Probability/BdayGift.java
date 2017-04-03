import java.io.*;
import java.util.*;
import java.text.DecimalFormat;



public class BdayGift {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	long sum = 0;
    	int ballValue = 0;
    	for(int i=0; i<n; i++){
    		ballValue = scan.nextInt();
    		sum = sum + ballValue;
    	}
    	DecimalFormat df2 = new DecimalFormat("#.0");
    	System.out.println(df2.format(sum/2.0));
    }
}