public class WhileLoop{
	static int x = 4;
//	static int y = 0;
	public static void main(String[] args){
		int x = 0;
//		int y = 0;
		do{
			int y = x++;
			System.out.println(x--);
		}while(y<5);

	}
}