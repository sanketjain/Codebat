
import java.util.*;

public class TraditionalSearch {
	public static void main(String[] args){
		System.out.println("Welcome to Lambda Expressions :-) ");
		System.out.print("\n");

		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Fish", false, true));
		animals.add(new Animal("Kangaroo", true, false));
		animals.add(new Animal("Rabbit", true, false));
		animals.add(new Animal("Turtle", false, true));

		print(animals, new CheckIfHopper());
	}

	private static void print(List<Animal> animals, CheckTrait checker){
		for (Animal animal: animals){
			if(checker.test(animal))
				System.out.println(animal + " ");
		}
		System.out.println();
	}
}

