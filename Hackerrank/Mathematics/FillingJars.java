import java.io.*;
import java.util.*;

public class FillingJars {

    public static void main(String[] args) {
        /* Enter your code here.*/
        Scanner scan = new Scanner(System.in);
        int n_Jars = scan.nextInt();
      	int m_Operations = scan.nextInt();
      	int a, b, k;
      	double count = 0.0;
        
        for(int i=0; i<m_Operations; i++){
        	a = scan.nextInt();
        	b = scan.nextInt();
        	k = scan.nextInt();
        	count = ((5*count) + ((b-a+1) * k))/5;
        }

       	System.out.println((int) Math.round(count));

    }
}