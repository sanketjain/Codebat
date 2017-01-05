
import java.util.*;

public class Initializers{
	
	public static final int NUM_BUCKETS = 45;
	private static final List<String> values = new ArrayList<>();

	public static void main(String[] args){

//		NUM_BUCKETS = 5; //DOES NOT COMPILE

		values.add("changed");
		values.add("change further");
		System.out.println(values.size());
		for (String value: values) {
			System.out.println(value);
		}
	}	
}
