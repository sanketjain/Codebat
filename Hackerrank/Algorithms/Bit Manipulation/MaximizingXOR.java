import java.io.*;
import java.util.*;

public class MaximizingXOR {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
		int r = in.nextInt();
		int maxXOR = 0;
		int currentXOR = 0;

		for(int i=l; i<=r; i++){
			for(int j=l; j<=r; j++){	
				currentXOR = i ^ j;
				if(currentXOR>maxXOR){
					maxXOR = currentXOR;
				}
			}
		}
		System.out.println(maxXOR);
	}
}