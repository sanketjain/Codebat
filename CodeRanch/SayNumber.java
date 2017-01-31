import java.lang.Exception;

public class SayNumber{
	public static void main(String[] args) throws Exception{
		
		long takein = Long.parseLong(args[0]);
		if (takein<1000000){
			int inputnumber = Integer.parseInt(args[0]);
			if (inputnumber<0){
				throw new Exception("Only non negative values allowed");
			} else if(inputnumber<1000){
				SayNumber.lessthanthousand(inputnumber);
			} else if(inputnumber<1000000){
				SayNumber.lessthanmillion(inputnumber);
			}
		} else {
			SayNumber.lessthanBillion(takein);
		}
		System.out.println();
	}	

	public static void lessthanBillion(long b){
		int millionquotient = (int)(long) (b/1000);
		int millionremainder = (int)(long) (b%1000);
		SayNumber.lessthanthousand(millionquotient);
		if(millionremainder==0){
			System.out.print(" million");
		} else {
			System.out.print(" million, ");
			SayNumber.lessthanthousand(millionremainder);
		}
	}

	public static void lessthanmillion(int m){
		int thousandsquotient = m/1000;
		int thousandsremainder = m%1000;
		SayNumber.lessthanthousand(thousandsquotient);
		if(thousandsremainder==0){
			System.out.print(" thousand");
		} else {
			System.out.print(" thousand, ");
			SayNumber.lessthanthousand(thousandsremainder);
		}
	}

	public static void lessthanthousand(int t){
		if(t>=100 && t<1000){
			System.out.print(SayNumber.hundredcall(t));
		} else {
			String xsmall= SayNumber.intToString(t);
			System.out.print(xsmall);
		}
	}

	public static String hundredcall(int inputnumber){
		int hundredstring = inputnumber%100;
		int hundredysaystring = inputnumber/100;
		String saystring = SayNumber.intToString(hundredstring);
		String sayhundred = SayNumber.intToString(hundredysaystring);
		if(hundredstring==0){return (sayhundred + " hundred ");}
		else {return (sayhundred + " hundred and " + saystring);}
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

