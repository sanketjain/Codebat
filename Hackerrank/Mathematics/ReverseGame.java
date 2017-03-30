import java.io.*;
import java.util.*;

public class ReverseGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner in = new Scanner(System.in);
       int t = in.nextInt();
        
       for(int i=0; i<t; i++){ //Do not disturb this line. It's perfect
			int n = in.nextInt();
			int k = in.nextInt();
			System.out.println(n + " " + k);
			List<Integer> arr = new ArrayList<>();

			for(int j=0; j<n; j++){
				arr.add(j);
			}

	        Collections.reverse(arr);

			for(int m = 0; m < arr.size(); m++) {
				System.out.println((arr.get(m)).toString());
			}  

       }
       
	}
}