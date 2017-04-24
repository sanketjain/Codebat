public class TestSum{
	public static void main(String[] args){
		int x=1, y=1, z=0;
		if(!(x++>1 && y++>1)){
			System.out.println(x + " "+  y + " " + z);
			z = x+y;
		}
		System.out.println(z);
		System.out.println(x);
	}
}