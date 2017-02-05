import java.util.Scanner;

public class ThreeInputs{
	public static void main(String[] args){
		Scanner myscanner = new Scanner(System.in);
		int scanInt = myscanner.nextInt();
		double scanDouble = myscanner.nextDouble();
		String scanString = myscanner.nextLine();
		System.out.println("String: " + scanString);
		System.out.println("Double: " + scanDouble);
		System.out.println("Int: " + scanInt);
	}
}