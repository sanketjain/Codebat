class CheckInitialization2{
	static boolean b2 = false;

	public static void main(String[] args){
		String str2;
		if(true){ //The difference is here, Check next class
			str2 = "true";
		}

		str2 = b2 ? str2:"false";
		System.out.println(str2);
	}
}


public class CheckInitialization{
	static boolean b = false;

	public static void main(String[] args){
		String str;
		if(b=true){
			str = "true";
		}

		str = b ? str:"false";
		System.out.println(str);
	}
}