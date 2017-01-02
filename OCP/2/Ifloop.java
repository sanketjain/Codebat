public class Ifloop {
	public static void main(String[] args){
		int hourOfDay = 25;
		int morningGreetingCount = 12;

		if (hourOfDay < 14)
			System.out.println("Good Morning");
			morningGreetingCount++;
			//Note morningGreetingCount increase and is out of if loop
		System.out.println(morningGreetingCount);
	}
}