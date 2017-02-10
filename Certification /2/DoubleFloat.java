public class DoubleFloat {
	public static void main(String[] args){
		double x  = 25.43;
//		float y = 12.4; //Does not compile. Need to add f in the end.
 		float y = 12.4f;
  		System.out.println(y);
  		y = -y;
  		System.out.println(y);

 		boolean bool = true;
 		boolean invbool = !bool; //Usage of unary ! operator
 		System.out.println(bool);
 		System.out.println(invbool);
	}
}
