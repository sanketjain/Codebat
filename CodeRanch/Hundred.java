//Write a program that will read in a name from the command line and write it out 100 times


public class Hundred{
	public static void main(String[] args){
		int count = 0;
		String a = args[0];
		for (int i=0; i<100; i++){
			count++;
			System.out.print(a + count);
		}			
//		System.out.print(count);
	}	
}
