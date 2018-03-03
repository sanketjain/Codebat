import java.util.List;
import java.util.ArrayList;

public class StringCharPrint{
	
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder("Whizlab");
		char[] ch = new char[4];
		sb.getChars(1, 5, ch, 1); //(1, 4, ch, 1) is right
		for(char c: ch)	System.out.println(c);
	}

}