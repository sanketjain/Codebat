public class UnreachableWhile{
	public static void main(String[] args){
		int i = 10;
		while(false){
			i = 20;
			System.out.println(i);
		}

	}
}