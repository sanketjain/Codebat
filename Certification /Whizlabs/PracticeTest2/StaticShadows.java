public class StaticShadows{

	static int x = 2;
	static int z;

	public static void main(String[] args){
		System.out.println(x+z);
	}

	static{
		int x = 3;
		z = x;
	}

}
