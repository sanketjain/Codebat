import java.io.*;
import java.util.*;

public class StrangeGridAgain {

    public static void main(String[] args) {
        /* Enter your code here.*/
        Scanner scan = new Scanner(System.in);
        long row = scan.nextLong();
        int column = scan.nextInt();
    //    System.out.println(column + " " + row);
        int lastDigit = 0;
        long firstDigit;

        if((row%2) == 0){
	        boolean rowisEven = true;
	        firstDigit = (row/2) - 1;
	        //last digits possible are: 1 3 5 7 9
	        switch(column){
	        	case 1: 
	        		lastDigit = 1;
	        		break;
	        	case 2:
	        		lastDigit = 3;
	        		break;
	        	case 3:
	        		lastDigit = 5;
	        		break;
	        	case 4:
	        		lastDigit = 7;
	        		break;
	        	case 5:
	        		lastDigit = 9;
	        		break;
	        }

        } else {
        	boolean rowisOdd = true;
        	firstDigit = (row/2);
        	//last digits possible are: 0 2 4 6 8
        	switch(column){
        		case 1:
        			lastDigit = 0;
	        		break;
	        	case 2:
	        		lastDigit = 2;
	        		break;
	        	case 3:
	        		lastDigit = 4;
	        		break;
	        	case 4:
	        		lastDigit = 6;
	        		break;
	        	case 5:
	        		lastDigit = 8;
	        		break;
        	}
        }
    //   	System.out.println(firstDigit+ " " + lastDigit);
       	System.out.println((firstDigit*10 + lastDigit));


   }
}
