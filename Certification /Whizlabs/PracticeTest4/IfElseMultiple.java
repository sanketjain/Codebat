public class IfElseMultiple{

	public static void main(String[] args){
		int y = 10;
		if(y++==10){
			System.out.println("inside first if " + y);
			if(y--==10){
				System.out.println("inside second if " + y);
				if(y==10){
					System.out.println("inside third if " + y);
					System.out.println("Sanket");
				} else {
					y*=3;
					System.out.println("inside first else " + y);
				} 
			} else { 
				y*=2;
				System.out.println("inside second else " + y);
			}
		}
		System.out.println(y);
	}
}