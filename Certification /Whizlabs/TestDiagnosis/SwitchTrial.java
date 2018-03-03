public class SwitchTrial{

	public static void main(String[] args){
		final int x = 0;
		//x = 0;
		final int y = 2;
		
		switch(x){
			case x: System.out.print("A");
			case 1: System.out.print("B");
			default: System.out.print("default"); break;
			case y: System.out.print("C");
		}
	}
	
}