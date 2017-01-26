import java.util.*;

public class InttoByte{
	public static void main(String[] args){
		String s, reverse = "";

        Scanner reader = new Scanner(System.in); 
        int x = reader.nextInt();
		s = Integer.toBinaryString(x);
//		System.out.println(s);

		int length = s.length();
 
    	for ( int i = length - 1; i >= 0; i-- )
        	reverse = reverse + s.charAt(i);
 
    	if (s.equals(reverse))
        	System.out.println("TRUE");
    	else
        	System.out.println("FALSE");

	}
}

