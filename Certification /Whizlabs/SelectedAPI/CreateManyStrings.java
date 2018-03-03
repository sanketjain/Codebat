import java.util.List;
import java.util.ArrayList;

public class CreateManyStrings{
	
	public static void main(String[] args){
		String s1 = new String();
		String s2 = new String(new byte[]{88, 89});
		String s3 = new String(new char[]{'1','2','3'});
		String s4 = new String(new StringBuilder("ABCD"));

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}