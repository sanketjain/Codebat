import java.util.List;
import java.util.ArrayList;

public class NoGeneric{
	
	public static void main(String[] args){
		List list = new ArrayList<>();
		list.add(5);
		list.add(5);
	//	System.out.println(list.get(0));
		System.out.println(Integer.max(list.get(0), 1));
	}

}