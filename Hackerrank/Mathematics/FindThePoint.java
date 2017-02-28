import java.io.*;
import java.util.*;

public class FindThePoint {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
       	int n = in.nextInt();
       	int p1, p2,q1, q2, r1, r2;
       	int distanceX, distanceY;

		for(int a=0; a<n; a++){       	
	       p1 = in.nextInt();
	       p2 = in.nextInt();
	       q1 = in.nextInt();
	       q2 = in.nextInt();
	       distanceX = p1-q1;
	       distanceY = p2-q2;
	       r1 = q1 - distanceX;
	       r2 = q2 - distanceY;
	       System.out.println(r1 + " " + r2);
	    }



    }
}