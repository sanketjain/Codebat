import java.util.List;
import java.util.ArrayList;

public class ListArray{
	
	public static void main(String[] args){

		List<String> string = new ArrayList<>();
		string.add("A");
		string.add("B");
		string.add("C");
		System.out.println(string);

		String[] arr = new String[2];
		arr = string.toArray(arr);

		for(String s: arr){
			System.out.println(s);
		}
	}

}