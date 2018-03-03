public class ScopeOrExceptionFind{

	public static void main(String[] args){
		int y = 10;
		try {
			int x = 0;
			int z = y/x;
			System.out.println(z);
		} catch (ArithmeticException ex){
//			System.out.println("Airthmetic divided by: " + x);			
		} catch (NumberFormatException ex){
			System.out.println("Number Format");
		}
	}
}