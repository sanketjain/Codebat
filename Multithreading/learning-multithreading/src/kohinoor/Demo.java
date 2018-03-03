package kohinoor;

public class Demo {

	public static void main(String[] args) {
		int n = 83;

		boolean returned = checkPrime(n);
		if (returned == true) {
			System.out.println("The number " + n + " is prime");
		} else {
			System.out.println("The number " + n + " is not prime");
		}
	}

	// public static boolean checkPrime(int n) {
	// boolean bool = true;
	// int count = 0;
	// if (n % 2 == 0) {
	// System.out.println("Total count is 1");
	// return false;
	// } else {
	// for (int x = 3; x < (n / 2 + 1); x=x+2) {
	// count++;
	// if ((n % x == 0) && (bool != false)) {
	// bool = false;
	// break;
	// // return false;
	// }
	// }
	// System.out.println("Total count is " + count);
	// return bool;
	// }
	// }
	//

	static int[] knownPrimes = { 2, 3, 5, 7 };

	public static boolean checkPrime2(int n) {
	//	boolean bool = true;
		
		for (int i = 0; i < knownPrimes.length; i++) {
			if (n % knownPrimes[i] == 0) {
				return false;
			}
		}
		return true;

	}

}
