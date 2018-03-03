import java.util.*;

public class SumToXInArray{
	public static void main(String[] args){
		int[] array = new int[]{1,2,3,4,5,6,7};
		int toFindSum = 3;
		int[] arrayTwoPass = new int[2];
		arrayTwoPass = twoSum(array, toFindSum);
		for(int element: xArray){
			System.out.println(element);
		}
	}	

	//Two Pass HashTable
	public static int[] twoSum(int[] array, int target){
		Map<Integer, Integer> map = new HashMap<>();
		for(int index=0; index<array.length; index++){
			map.put(array[index], index);
		}

		int compliment;
		for(int index=0; index<array.length; index++){
			compliment = target - array[index];
			if(map.containsKey(compliment) && compliment!=index){
				return new int[]{index, map.get(compliment)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	//One pass hashtable
	public static int[] twoSumOnePass(int[] array, int target){
		Map<Integer, Integer> map = new HashMap<>();
		int compliment;
		for(int index=0; index<array.length; index++){
			compliment = target - array[index];
			if(map.containsKey(compliment) && compliment!=index){
				return new int[]{index, map.get(compliment)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}

