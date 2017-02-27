import java.io.*;
import java.util.*;

public class TwoStrings2{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       String a, b;

       for(int i=0; i < (2*n); i=i+2){
           a = in.next();
           b = in.next();
           boolean bool = TwoStrings2.hasCommon(a, b);
           if(bool){
           		System.out.println("YES");
           } else {
           		System.out.println("NO");
           }
       }
    }


    static boolean hasCommon(String A, String B) {
	    Set<Character> bookA = new HashSet<Character>();
	    Set<Character> bookB = new HashSet<Character>();

	    for(char a : A.toCharArray())
	        bookA.add(a);
	    for(char b : B.toCharArray())
	        bookB.add(b);

	    for(char c : bookA) {
	        if(bookB.contains(c))
	            return true;
	    }

	    return false;
	} 


}
//Perfect code

