import java.util.*;

public class FactorialsArray{
	public static void main(String[] args){
		List<Integer> list1 = new ArrayList();		
		list1 = nonRecursive(0);
		System.out.println(Arrays.toString(list1.toArray()));

		List<Integer> list2 = new ArrayList();		
		list2 = nonRecursive(1);
		System.out.println(Arrays.toString(list2.toArray()));
		
		List<Integer> list3 = new ArrayList();		
		list3 = nonRecursive(30);
		System.out.println(Arrays.toString(list3.toArray()));
	}

//Eg: 30: 1, 2, 3, 5, 6, 10, 15

	public static List<Integer> nonRecursive(int n){
		List<Integer> list = new ArrayList();

		if(n==0){
			list.add(0);
			list.add(1);
		}

		if(n==1){
			list.add(1);
		}

		for(int factor = 1; factor <= n/2; factor++){
			if(n % factor == 0){
				list.add(factor);
			}
		}

		return list;
	}

}