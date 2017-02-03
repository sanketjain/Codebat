import java.math.BigInteger;
public class Grains{
	public static void main(String[] args){
		int[] squareno = new int[64];
		BigInteger grains0 = new BigInteger("1");
		BigInteger grains1 = new BigInteger("1");
		BigInteger sum = new BigInteger("1");

	//	long[] grains = new long[65];
		
		System.out.println("square 1: 1 grain");

		for (int i = 1; i<64; i++){
			squareno[i] = i+1;
			System.out.print("square " + squareno[i]);
			grains1 = grains0.add(grains0);
			sum = sum.add(grains1);
			System.out.println(": " + grains1 + " grains");
		//	System.out.println(sum);
			grains0 = grains1;
		}
		System.out.println(sum);
	}
}