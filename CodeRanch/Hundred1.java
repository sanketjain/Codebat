//Write a program that will read in a name from the command line and write it out 100 times


public class Hundred1{
	public static void main(String[] args){
		String str = args[0];
		int count = 0;
		int consolelength = 80;
		int lesserthanconsolelength = 0;
		int stringLength = str.length();
		System.out.println("Input string length is:" + stringLength);

		for (int i=0; i<100; i++){
		//	count++;
			System.out.print(str + " ");
			lesserthanconsolelength = lesserthanconsolelength + stringLength + 1;
			System.out.print(lesserthanconsolelength);
			
			if(lesserthanconsolelength>=consolelength){
				System.out.println();
				lesserthanconsolelength = 0;
			} 
//			count++;
//			System.out.print(a + count + " ");
		}			
		System.out.println(count);
	}	
}
