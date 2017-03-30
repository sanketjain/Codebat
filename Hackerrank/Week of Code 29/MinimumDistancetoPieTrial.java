import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumDistancetoPieTrial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long min = in.nextLong();
        long max = in.nextLong();
        // your code goes here

        for(long i=min; i<=max; i++){
        	System.out.println(i);
        	//Call divisionValue(i) method;
        	String value = MinimumDistancetoPie.divisionValue(i);
        	System.out.println(value);
        }
    }

    public static String divisionValue(final long checkDenominator){   
    double distanceToPie, minDistance=0; 	
    long numerator=0L, denomenator=0L;

    	for(long j=(3*checkDenominator); j<=(4*checkDenominator); j++){
    		distanceToPie = (j/checkDenominator)-(Math.PI);
            System.out.println("distanceToPie is " + distanceToPie );
            if(distanceToPie<0){
                distanceToPie = -1*distanceToPie;
            }

    		if(distanceToPie<minDistance){
    			minDistance = distanceToPie;
    			numerator = j;
    			denomenator = checkDenominator;
                System.out.println(numerator/denomenator);
    		}
    	}


    	String str = (numerator + "/" + denomenator);
    	return str;

    }

}
