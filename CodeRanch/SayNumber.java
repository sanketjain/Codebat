public class SayNumber{
	public static void main(String[] args){
		int inputnumber = Integer.parseInt(args[0]);
		if(inputnumber<0 || inputnumber>100){
			System.out.println("Invalid entry");
		} else {
			String saystring = SayNumber.intToString(inputnumber);
			System.out.println(saystring);
//			for(int x=0; x<100; x++){ System.out.println(x + " " + SayNumber.intToString(x)); }

		}
	}	

	public static String intToString(int intinput){
		String[] firstword = new String[20];
		firstword[10] = "ten";
		firstword[11] = "eleven";
		firstword[12] = "twelve";
		firstword[13] = "thirteen";
		firstword[14] = "fourteen";
		firstword[15] = "fifteen";
		firstword[16] = "sixteen";
		firstword[17] = "seventeen";
		firstword[18] = "eighteen";
		firstword[19] = "nineteen";
		
		firstword[2] = "twenty";
		firstword[3] = "thirty";
		firstword[4] = "fourty";
		firstword[5] = "fifty";
		firstword[6] = "sixty";
		firstword[7] = "seventy";
		firstword[8] = "eighty";
		firstword[9] = "ninety";

		String[] lastword = new String[10];
		lastword[0] = "zero";
		lastword[1] = "one";
		lastword[2] = "two";
		lastword[3] = "three";
		lastword[4] = "four";
		lastword[5] = "five";
		lastword[6] = "six";
		lastword[7] = "seven";
		lastword[8] = "eight";
		lastword[9] = "nine";
		
		if(intinput/10 == 0){
			return lastword[intinput];
		} else if((intinput/10)==1){
			return firstword[intinput];
		} else if((intinput%10) != 0){
			return firstword[intinput/10] + "-" +lastword[intinput%10];
		} else {
			return firstword[intinput/10];
		}
	}
}




