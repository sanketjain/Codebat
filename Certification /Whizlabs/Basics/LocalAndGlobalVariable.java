public class LocalAndGlobalVariable{
	static int x = 4;

	public static void main(String[] args){
		for(int x = 5; x<10; x++){
			System.out.println("Before inner x++ " + x);
			x++;
			System.out.println("After inner x++ " + x);
		}

		System.out.println(x--);
		System.out.println(x);
	}

}