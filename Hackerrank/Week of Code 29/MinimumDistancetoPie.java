import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumDistancetoPie {

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
    	double distanceToPie = 0.0d;
    	double minDistance = 0.0d;
    	long minJ, maxJ;
    	long numerator=0L; long denomenator=0L;

    	if(checkDenominator>10000){
    		minJ = (long) (3.141*checkDenominator);
    		maxJ = (long) (3.142*checkDenominator);
    	} else if(checkDenominator>100){
    		minJ = (long) (3.1*checkDenominator);
    		maxJ = (long) (3.2*checkDenominator);
    	} else {
    		minJ = 3*checkDenominator;
    		maxJ = 4*checkDenominator;
    	}

    	for(long j=(minJ); j<=(maxJ); j++){
    		distanceToPie = (j/checkDenominator)-(Math.PI);
    		if(distanceToPie<minDistance){
    			minDistance = distanceToPie;
    			numerator = j;
    			denomenator = checkDenominator;
    		}
    	}




    	String str = (numerator + "/" + denomenator);
    	return str;

    }

}
