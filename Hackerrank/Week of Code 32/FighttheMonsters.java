import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FighttheMonsters {

    static int getMaxMonsters(int n, int hit, int t, int[] h){
        Arrays.sort(h);
	//	System.out.println(Arrays.toString(h));       
		int count = 0;
		int i = 0;
		while (t>=0){
			if(h[i]>0){
				h[i] = h[i] - hit;
				t = t-1;
			} else {
				i = i + 1;
				count = count + 1;
			}
		}

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int hit = in.nextInt();
        int t = in.nextInt();
        int[] h = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        int result = getMaxMonsters(n, hit, t, h);
        System.out.println(result);
    }
}
