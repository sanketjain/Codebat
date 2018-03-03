import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashTreeAndLinkedMap{
	public static void main(String[] args){
		HashMap hm = new HashMap();
		System.out.println("HashMap prints in completely random order");
		insertAndPrint(hm);

		LinkedHashMap lhm = new LinkedHashMap();
		System.out.println("LinkedHashMap prints in the same order as entered");
		insertAndPrint(lhm);

		TreeMap tm = new TreeMap();
		System.out.println("TreeMap prints ordered output");
		insertAndPrint(tm);
	}

	static void insertAndPrint(AbstractMap<Integer, String> map){
		int[] array = {1, -1, 0, 2, -2, 3};
		for(int x: array){
			map.put(x, Integer.toString(x));
		}

		for(int k: map.keySet()){
			System.out.print(k + ", ");
		}
		System.out.println();

	}
}