import java.io.*;
import java.util.*;


public class CutTheSticks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
       	int n = in.nextInt();
       	ArrayList<Integer> values = new ArrayList<Integer>(n);
        for(int i=0; i < n; i++){
            values.add(in.nextInt());
        }

        int shortestStick = 0;

        while(values.size()> 0){
          	shortestStick = Collections.min(values);
        	System.out.println(values.size());
        	for(int j=0; j<(values.size()); j++){
        		values.set(j, (values.get(j)-shortestStick));
        		if(values.get(j)<=0){
        			values.remove(j);
        			j = j-1;
        		}
        	}
        }

    }
}