public class StringBuilderStart {
	public static void main(String[] args){

		String alpha = "";
		for (char current = 'a'; current<='z'; current++){
			alpha += current;
		}
		System.out.println("String with garbages: " + alpha);

		StringBuilder beta = new StringBuilder();
		for (char cur = 'a'; cur<='z'; cur++){
			beta.append(cur);
		}
		System.out.println("String Builder Yay! : " + beta);
		System.out.print("\n");

		//Mutability and Chaining
		StringBuilder sb0  = new StringBuilder("start ");
		sb0.append("+ middle ");
		StringBuilder same = sb0.append("+ end");
		System.out.println(same);
		System.out.print("\n");


		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b=b.append("f").append("g");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.print("\n");

		//Creating a stringbuilder
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animals");
		StringBuilder sb3 = new StringBuilder("10");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.print("\n");

		//Methods on String Builder
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println("Example of charAt(), indexOf(), length(), substring() :");
		System.out.println(sub + " " + len + " " + ch);
		System.out.print("\n");

		//append()
		StringBuilder sb4 = new StringBuilder().append(1).append('c');
		sb.append("_").append("true");
		System.out.println("Example of append: " + sb);
		System.out.print("\n");

		//insert()
		sb2.insert(7, "_");
		sb2.insert(0, "_");
		sb2.insert(4, "_");
		System.out.println("Insert method : " + sb2);
		System.out.print("\n");

		//delete() and deleteCharAt()
		StringBuilder sb5 = new StringBuilder("abcdef");
		sb5.delete(1, 3);
//		sb5.deleteCharAt(3, 5); //Throws error. as new string is of lenght less than 5
		System.out.println("Delete method: " + sb5);
		System.out.print("\n");

		//reverse()
		sb5.reverse();
		System.out.println("After reverse: " + sb5);
		System.out.print("\n");

		//convert to String
		String s  = sb5.toString();
		System.out.println(s + " is of type - " +  s.getClass().getName());
		System.out.print("\n");

		//understanding Equality
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two);
		System.out.println(one == three);
		System.out.print("\n");
		
		String x = "Hello World";
		String y = "Hello World";
		System.out.println("Strings are literal and JVM created only one literal, pointing to same memory location so: ");		
		System.out.println(x == y);
		System.out.print("\n");

		String z = " Hello World".trim();
		System.out.println("We don't have same string literal so: ");		
		System.out.println(x == z);
		System.out.print("\n");

		//Specifically requesting a different string object:
		String x1 = new String("Hello World");
		String y1 = "Hello World";
		System.out.println("Specifically requested a different string object so: ");
		System.out.println(x1 == y1);
		System.out.print("\n");

		String m = "Hello World";
		String n = " Hello World".trim();
		System.out.println("Equals method check the values inside the String rather than String itself so: ");
		System.out.println(m.equals(n));
		System.out.print("\n");
		
	}	
}
