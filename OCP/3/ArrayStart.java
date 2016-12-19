import java.util.Arrays;

public class ArrayStart {
	public static void main(String[] args){

		int[] numbers1 = new int[3];
		int numbers2[] = new int[] {23, 53, 12};
		int [] numbers3 = {12, 154, 85}; //anonymous array
		System.out.println(numbers1[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers3[2]);
		System.out.print("\n");

//		Multiple arrays in declaration
//		int[] ids1, types1;
//		int ids2[], types2;
//		System.out.println(ids1.getClass().getName());
//		System.out.println(types1.getClass().getName());
//		System.out.println(ids2.getClass().getName());
//		System.out.println(types2.getClass().getName());

//		We can call equals because array is an object
//		This would not work on int[]. int is a primitive; int[] is an object
		String [] bugs = {"cricket", "bettle", "ladybug"};
		String [] alias = bugs;
		System.out.println(bugs.equals(alias));
		System.out.println(bugs.toString());
		System.out.println("[L means it is array, java.lang.String is the reference type");
		System.out.print("\n");

		String names[];
//		System.out.println(names[]); 
	
		String names2[] = new String[2];
		System.out.println("length of names is: " + names2.length);
		System.out.println("Value stored in names2[0] is: " + names2[0]);
		System.out.print("\n");

		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
//		againStrings[0] = new StringBuilder(); //Does not compile as againSTrings[0] is a string type
//		objects[0] = new StringBuilder(); //throws exception
		System.out.print("\n");

		String[] mammals = {"monkey", "chimp", "donkey"};
		System.out.println(mammals.length);
		System.out.println(mammals[0]);
		System.out.println(mammals[2]);
		System.out.print("\n");

		int[] numbers = new int[10];
		for (int i = 0; i<numbers.length; i++){
			numbers[i] = i+5;
			System.out.println(numbers[i]);

		}
		System.out.print("\n");

		int[] numbers5 = { 3, 63, 23, 763, 25 };
		Arrays.sort(numbers5);
		for (int i=0; i<numbers5.length; i++){
			System.out.println(numbers5[i]);
		}
		System.out.print("\n");

		//Important example of string in arrays
		String[] strings1 = { "10", "9", "100" };
		Arrays.sort(strings1);
		for (String str: strings1){
			System.out.print(str + " ");
		}
		System.out.println("\n");

		// Binary Search works only if array is already sorted
		int[] numbers6 = {2, 4, 6, 8};
		System.out.println(Arrays.binarySearch(numbers6, 2));
		System.out.println(Arrays.binarySearch(numbers6, 4));
		System.out.println(Arrays.binarySearch(numbers6, 1));
		System.out.println(Arrays.binarySearch(numbers6, 3));
		System.out.println(Arrays.binarySearch(numbers6, 9));
		System.out.print("\n");


		int[][] vars1; //2D array
		int vars2 [][]; //2D array
		int[] vars3[]; //2D array
		int[] vars4 [], space [][]; //2D and 3D array
		String [][] rectangle = new String [3][2];
		rectangle[0][1] = "set";

		System.out.println();
		System.out.print("\n");

		System.out.println();
		System.out.print("\n");

		System.out.println();
		System.out.print("\n");

		System.out.println();
		System.out.print("\n");

		System.out.println();
		System.out.print("\n");

		System.out.println();
		System.out.print("\n");








	}
}
