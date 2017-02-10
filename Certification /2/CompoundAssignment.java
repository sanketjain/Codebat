public class CompoundAssignment {
	public static void main(String[] args){
		long x = 10;
		int y = 5;
//		y = y * x; //Not possible cuz y is int
		y *= x; //Possible and important use of COMPOUND ASSIGNMENT
		System.out.println(y);

		int m = 5;
		long n = (m = 3);
		System.out.println(n);
		System.out.println(m);
	}
}