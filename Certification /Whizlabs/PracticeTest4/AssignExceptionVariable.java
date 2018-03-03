public class AssignExceptionVariable{
	public static void main(String[] args){
		try{
			System.out.print(args[0]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
			if (e instanceof ArrayIndexOutOfBoundsException){
				throw new ArrayIndexOutOfBoundsException("Out of bounds.");
			} else if (e instanceof NullPointerException) {
				throw new NullPointerException("Null Value");
			} else {
				throw new ArithmeticException("Arithmetic");
			}
//			System.out.println(e.getMessage());
		}
	}
}