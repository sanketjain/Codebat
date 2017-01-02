public class LogicalandShort {
	public static void main(String[] args){
		int y = 7;
		boolean x = true || (y < 4);
		System.out.println(x);


		int m = 6;
		boolean n = (m>=6) || (++m <= 7);
//Imp: In above line the ++m is never evaluated cuz left hand side of || is true.
//In Short-circuit operator right hand side of expression may never be evaluated 
//if the final result can be determined by the left hand side of the expression.
		System.out.println(m);

	}
}
