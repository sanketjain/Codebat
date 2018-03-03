//Important example. Default value of primitives is something in general.
//But what about Array?
public class ArrayInitialization{
	public static void main(String[] args){
		int[] ints = new int[0b101];
		int len = ints.length;

		for(int i: ints)
			System.out.print(i);
	}
}