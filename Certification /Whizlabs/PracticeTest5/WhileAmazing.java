public class WhileAmazing{

	public static void main(String[] args){
		int a = 1;
		while(a<=3){
			if(a++ == 2)
				continue;
				System.out.print(a + " ");
		}
	}
}