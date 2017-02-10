public class WhileLoopVariations{
	public static void main(String[] args){
		// for ( ; ; ){ System.out.println("Hello World"); } //Infinite loop

		int x = 0;
		for(long y=0, z=4; x<5 && y<10; x++, y++){
			System.out.println(y + " ");
		} System.out.print("\n");

		x = 0;
		long y = 10;
//		for(long y=0, x=4; x<5 && y<10; x++, y++){ //Does not work cuz x is already declared
//		for(long y=0, int x=4; x<5 && y<10; x++, y++){ //Does not compile cuz variable in initialization block must all be of the same type
		for(y=0, x=4; x<5 && y<10; x++, y++){
			System.out.println(x + " ");
		} 
	}
}

