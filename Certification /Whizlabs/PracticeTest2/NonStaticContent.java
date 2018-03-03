public class NonStaticContent{
	int x = 10;

	public static void main(String[] args){
		int y = 12;
		System.out.print(x + y);
		int x = 11;
	}

}