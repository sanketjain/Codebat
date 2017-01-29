public class Hundred1Trial4{
	public static void main(String[] args){
		String inputstr = args[0];
		System.out.println(inputstr);

		String outputStr = inputstr + " ";
		int outputStrlength = outputStr.length();
		System.out.println(outputStr);
		System.out.println(outputStrlength);

		int count = 0;
		int maxconsolelength = 80;
		int outputconsolelength = 0;
		while(count<100){
			if ((outputconsolelength+outputStrlength)<maxconsolelength){
				System.out.print(outputStr);
//				System.out.print(count);
				count++;
				outputconsolelength = outputconsolelength + outputStrlength;
			} else {
				System.out.println(outputconsolelength);
				System.out.println();
				outputconsolelength = 0;
			}
		}
		System.out.println(count);
	}
}

