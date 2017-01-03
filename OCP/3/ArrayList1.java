import java.util.*;

public class ArrayList1{
	public static void main(String[] args){
		ArrayList  list1 = new ArrayList(); 
		ArrayList  list2 = new ArrayList(10); 
		ArrayList  list3 = new ArrayList(list2); 
		ArrayList<String>  list4 = new ArrayList<String>(); 
		ArrayList<String>  list5 = new ArrayList<>(); 
		List<String> list6 = new ArrayList<>();
//		ArrayList<String> list7 = new List<>(); //Does not compile
		System.out.print(list1);
		System.out.print(list2);
		System.out.print(list3);
		System.out.print(list4);
		System.out.print(list5);
		System.out.println(list6);

		list1.add("hawk");
		list1.add(Boolean.TRUE);
		System.out.println(list1);

		list4.add("sparrow");
//		list4.add(Boolean.TRUE); //Gives mismatch
		System.out.println(list4);

		list6.add("hawk");
		System.out.println(list6);
		list6.add(1, "robin");
		System.out.println(list6);
		list6.add(0, "blue jay");
		System.out.println(list6);
		list6.add(1, "cardinal");
		System.out.println(list6);

		System.out.println(list6.remove("cardinal1")); //Return type is boolean
		System.out.println(list6.remove("hawk"));
		System.out.println(list6);

		System.out.println(list6.size());
		list6.set(0, "Eagle");
		System.out.println(list6);
		System.out.println(list6.size());
//		list6.set(5, "Eagle"); //Index out of Bounds
		System.out.println(list6.contains("robin"));

		System.out.println(list6.isEmpty());
		list6.clear();
		System.out.println(list6.isEmpty());
		System.out.println(list6);

		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two));
		one.add("a");
		System.out.println(one.equals(two));
		two.add("a");
		System.out.println(one.equals(two));
		one.add("b");
		two.add(0, "b");
		System.out.println(one.equals(two));

	}
}
