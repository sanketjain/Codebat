public class MultiCatch{

	static Integer i;

	public static void main(String[] args){
		try{
			System.out.println(i.doubleValue());
		} catch (NullPointerException | ArithmeticException e){
			System.out.println(e.getClass().getSimpleName());
		}

		try{
			System.out.println(i.doubleValue());
		} catch (NullPointerException | RuntimeException e){
			System.out.println(e.getClass().getSimpleName());
		}
	}
}