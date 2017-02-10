
public class CompareValues3 {
	public static void main(String[] args){
		int x = 0;
		while (++x<10) {}
		String message = x > 10 ? "Greater than" : "false";
		System.out.println(message + " and the value is: " + x);	
	}
}