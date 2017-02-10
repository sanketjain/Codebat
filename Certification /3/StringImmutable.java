public class StringImmutable {
	public static void main(String[] args){

		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3"); //s2 is Immutable
		System.out.println(s2); 
		s2 = s2.concat("3"); //we changed s2 to reference new object
		System.out.println(s2);
	}
}

