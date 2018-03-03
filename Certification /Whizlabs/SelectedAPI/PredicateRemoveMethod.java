import java.util.List;
import java.util.ArrayList;

public class PredicateRemoveMethod{
	
	public static void main(String[] args){

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(2,3);
		System.out.println(list);

		list.removeIf(e->e<3);
		System.out.println(list);
	}

}