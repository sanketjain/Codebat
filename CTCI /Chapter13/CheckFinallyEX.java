import java.lang.ArithmeticException;

public class CheckFinallyEX{
	public static void main(String[] args){
		System.out.println(CheckFinallyEX.method());
	}

	public static String method(){
		try {
			System.out.println("Try block Print Statement");
			int length = Integer.parseInt("A1");
			return "Try block return";
		} catch (ArithmeticException e){

		} finally {
			System.out.println("Finally Block Print Statement");
			return "Finally block return";
		}
	}
	
}