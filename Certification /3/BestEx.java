public class BestEx{
	public static void main(String[] args){
		String[] strings = { "stringValue" };
		System.out.println(strings.getClass().getName());
		System.out.println();

		Object [] objects = strings;
		System.out.println(objects.getClass().getName());
		System.out.println();

		String[] againStrings = (String[]) objects;
		System.out.println(againStrings.getClass().getName());
		System.out.println();

//		againStrings[0] = new StringBuilder(); //Incompatible types
//		objects[0] = new StringBuilder(); //objects is pointing to a string type

	}
}

