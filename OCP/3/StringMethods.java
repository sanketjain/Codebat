public class StringMethods {
	public static void main(String[] args){

		String string = "animals";

		System.out.println(string.charAt(0));
		System.out.println(string.charAt(6));
//		System.out.println(string.charAt(7)); //Throws Exception		System.out.print("\n");
		System.out.print("\n");

		System.out.println(string.indexOf("a"));
		System.out.println(string.indexOf("al"));
		System.out.println(string.indexOf('a', 4));
		System.out.println(string.indexOf("al", 5)); //indexOf() does not throw exception. It returns -1 when match not found 
//		System.out.println(string.indexOf(0));
		System.out.println("Substring examples");

		System.out.println(string.substring(3));
		System.out.println(string.substring(string.indexOf('n')));
		System.out.println(string.substring(3, 4));
		System.out.println(string.substring(3, 7));
		System.out.println(string.substring(3, 3)); //Returns empty string
//		System.out.println(string.substring(3, 2)); //throws exception
//		System.out.println(string.substring(3, 8)); //throws exception
		System.out.print("\n");

		System.out.println(string.toUpperCase());
		System.out.println("ABC123".toLowerCase());
		System.out.print("\n");

		System.out.println("abc".equals("ABC"));
		System.out.println("ABC".equals("ABC"));
		System.out.println("abc".equalsIgnoreCase("ABC"));
		System.out.print("\n");

		System.out.println("abc".startsWith("a"));
		System.out.println("abc".startsWith("A"));
		System.out.println("abc".endsWith("c"));
		System.out.println("abc".endsWith("a"));
		System.out.print("\n");

		System.out.println("abc".contains("b"));
		System.out.println("abc".contains("B"));
		System.out.print("\n");

		System.out.println("abcabc".replace('a', 'A')); //passing char parameter
		System.out.println("Replaced output: " + "abcabc".replace("a", "A")); //passing string parameter
		System.out.print("\n");

		System.out.println("abc".trim());
		System.out.println("\t a b c \n".trim());
		System.out.print("\n");

		String start  = "AniMaL      ";
		String trimmed = start.trim();
		String lowercase = trimmed.toLowerCase();
		String result = lowercase.replace('a', 'A');
		System.out.println("Trimmed output: " + result);
		System.out.print("\n");

		String result2 = "Appalachia       ".trim().toLowerCase().replace('a', 'A');
		System.out.println("Chaning result is: " + result);
		System.out.print("\n");

		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a= " +  a);		
		System.out.println("b= " + b);

	}
}