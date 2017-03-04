import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayoftheProgrammer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        // your code goes here
       
       int daysinFeb;

       if(y==1918){
       		daysinFeb = 28;
       		System.out.println("26.09.1918");
       } else if (y>=1919){
       	//Use Georgian calendar
       	int checkLeapYear = y;
			if (checkLeapYear%4 == 0){
				if(checkLeapYear%100 == 0 ){
					if(checkLeapYear%400 == 0){
			//			System.out.println("Leap Year");
						daysinFeb = 29;
					} else {
			//			System.out.println("not a Leap Year");						
						daysinFeb = 28;
					}
				} else {
			//		System.out.println("Leap Year");
						daysinFeb = 29;					
				}
			} else {
			//	System.out.println("not a Leap Year");
				daysinFeb = 28;
			}

			if(daysinFeb==29){
				System.out.println("12.09." + y);
			} else {
				System.out.println("13.09." + y);
			}
       } else {
	       	//Use Julian system
	       	if (y%4==0){
	       	//	System.out.println("Leap Year");
				daysinFeb = 29;
	       	} else {
	       //		System.out.println("Not a leap Year");
				daysinFeb = 28;
	       	}
	       	if(daysinFeb==29){
				System.out.println("12.09." + y);
			} else {
				System.out.println("13.09." + y);
			}

       }



        
        
        
        
        
        
        
        
        
    }
}
