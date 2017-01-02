public class Ternary4 {
	public static void main(String[] args){
		int y = 1;
		int z = 1;
		final int x = y<10 ? y++ : z++ ;
		System.out.println(y + ", " + z);


		int b = 1;
		int c = 1;
		final int a = b>10 ? b++ : c++ ;
		System.out.println(b + ", " + c);
	}
}