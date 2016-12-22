public class VarargsStart {
	public static void main(String[] args){
		System.out.println("Main method begins");
		walk(1);
		walk(1, 2);
		walk(1, 2, 3);
		walk(1, new int[] {4, 5});
//		walk(1, null); //Imp - Throws NullPointerException
		run(11, 22);
		System.out.print("\n");
	}

	public static void walk(int start, int... nums){
		System.out.println(nums.length);
	}

	public static void run(int... nums){
		//Varargs uses array indexing
		System.out.println("Output of run is " + nums[1]);
	}
}
