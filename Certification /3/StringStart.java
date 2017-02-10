public class StringStart {
	public static void main(String[] args){
		String name = "Fluffy";
		String name1 = new String("Fluffy1"); //String class is special and does not need to be instantiated with new
		System.out.println(name);
		System.out.println("With new method " + name1);
		
		System.out.println(1+2+"c");

		int three = 3;
		String four = "4";
		System.out.println(1+ 2 + three + four);

		String s = "1";
		s+=2;
		System.out.println(s);
		s+=3;
		System.out.println(s);

	}
}