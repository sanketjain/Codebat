import java.io.*;
import java.util.*;
public class SumarAndTheFloatingRocks {
    public static void main(String[] args) {
        /* Enter your code here.*/
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int x1, y1, x2, y2, xstart, ystart, xend, yend;
        double mSlope;
        int count = 0;

        for(int i=0; i<t; i++){
        	int x1 = scan.nextInt();
        	int y1 = scan.nextInt();
        	int x2 = scan.nextInt();
        	int y2 = scan.nextInt();
        }

        mSlope = (y2-y1)/(x2-x1);

        if(x1>x2){
        	xstart = x2;
        	xend = x1;
        } else {
        	xstart = x1;
        	xend = x2;
        }
        
        for(int x=xstart; x<=xend; x++){
        	if(y2>y1){
        		for(int y=y2; y>=y1; y--){

        		}
        	} else {
        		for (int y=y1; y<=y2; y++){

        		}
        	}
        }
    }
}



















