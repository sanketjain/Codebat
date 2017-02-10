import java.util.*;

public class WrapperEx{
	public static void main(String[] args){
		int primitive = Integer.parseInt("123");
		Integer wrapper = Integer.valueOf("123");
		System.out.println(primitive);
		System.out.println(wrapper);

		List<Double> weights = new ArrayList<>();
		weights.add(50.5);
		System.out.println(weights);
		weights.add(new Double(60));
		System.out.println(weights);
		weights.remove(50.5);
		System.out.println(weights);
		double first = weights.get(0);
		System.out.println(weights);

		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		int h = heights.get(0);

	}
}
