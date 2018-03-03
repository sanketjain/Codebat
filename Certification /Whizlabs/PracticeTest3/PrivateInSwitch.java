public class PrivateInSwitch{

	public static void main(String[] args){

		final int s = 2;
		private final int x = 3;

		switch(s){
			case 1: System.out.print("A"); break;
			case x-1: System.out.print("B"); 
			case x: System.out.print("C"); break;
			case x+1: System.out.print("D"); break;
			default: System.out.print("F");

		}
	}
	
}

//Note: private local access modifier is not allowed :(