//Write a program that will read in a name from the command line and write it out 100 times


public class Hundred2{
	public static void main(String[] args){
		int count = 0;
		int consoleLength = 80;
		int lesserthanconsoleLength = 0;
		String a = args[0] + " ";
		for (int i=0; i<100; i++){
			count++;
			lesserthanconsoleLength = lesserthanconsoleLength + a.length();
			if(lesserthanconsoleLength<=consoleLength){
				System.out.print(a);
			} else{
				System.out.println();
				lesserthanconsoleLength = 0;			
			}
		}			
//		System.out.print(count);
	}	
}
