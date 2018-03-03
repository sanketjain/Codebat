public class CheckMain{
	public static void main(int[] i){
		System.out.println("main1");
	}
	public static void main(String... c){
		System.out.println("main2");
	}
	public static void main(String c){
		System.out.println("main3");
	}

}


//Important note: Main method can be final in Java
//Second main method works
//first and third are overloaded version of main method and are legal
