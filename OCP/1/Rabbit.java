public class Rabbit {
	public static void main(String[] args){
		Rabbit one = new Rabbit();
		System.out.println(one);
		Rabbit two = new Rabbit();
		System.out.print(one);
		System.out.println(two);
		System.out.println();

		Rabbit three = one;
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println();

		one = null;
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println();

		Rabbit four = one;
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println();

		three = null;
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println();

		two = null;
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println();

		two = new Rabbit();
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);

		System.gc();
	}
}