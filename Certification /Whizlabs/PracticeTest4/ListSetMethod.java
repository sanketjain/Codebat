import java.util.List;
import java.util.ArrayList;

public class ListSetMethod{

	public static void main(String[] args){
		List list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		System.out.println(list);

		System.out.println(list.set(3, "3"));
		System.out.println(list);
	}
}
