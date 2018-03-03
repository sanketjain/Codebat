import java.util.*;
import java.util.stream.Collectors;
import java.util.function.*;

public class LambdaRandomExample{
	public static void main(String[] args){
		List<Integer> givenList = new ArrayList<Integer>();
		givenList.add(1);
		givenList.add(2);
		givenList.add(3);

		System.out.println("Classical way of generating");
		List<Integer> returnedList = getRandomSubset(givenList);
		for(Integer intI : returnedList){
			System.out.println(intI);
		}

		System.out.println("Lambda - A new way");
		List<Integer> returnedList2 = getRandomSubsetLambda(givenList);
		for(Integer intI2 : returnedList2){
			System.out.println(intI2);
		}

		System.out.println("Predicate - Modern style!!!");
		List<Integer> returnedList3 = getRandomSubsetPredicate(givenList);
		for(Integer intI3 : returnedList3){
			System.out.println(intI3);
		}

	}

	public static List<Integer> getRandomSubset(List<Integer> list){
		List<Integer> subset = new ArrayList<Integer>();
		Random random = new Random();
		for(int item : list) {
			if(random.nextBoolean()){
				subset.add(item);
			}
		}
		return subset;
	}

	//Using lambda
	public static List<Integer> getRandomSubsetLambda(List<Integer> list){
		Random random = new Random();
		List<Integer> subset = list.stream().filter(
			k -> {return random.nextBoolean();
			}).collect(Collectors.toList());
		return subset;
	}

	//Using predicate
	static Random random = new Random();
	static Predicate<Object> flipCoin = o -> {
		return random.nextBoolean();
	};
	public static List<Integer> getRandomSubsetPredicate(List<Integer> list){
		Random random = new Random();
		List<Integer> subset = list.stream().filter(flipCoin).
			collect(Collectors.toList());
		return subset;
	}

}