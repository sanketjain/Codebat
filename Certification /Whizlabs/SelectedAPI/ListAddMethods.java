import java.util.List;
import java.util.ArrayList;

public class ListAddMethods{
	
	public static void main(String[] args){
		List list = new ArrayList(1);
		list.add(1);
		list.add("A");
		list.add(new Integer(5));
		System.out.println(list);
	}

}