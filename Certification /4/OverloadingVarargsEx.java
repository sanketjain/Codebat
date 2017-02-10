public class OverloadingVarargsEx{

	public void fly(int[] lengths){ }
//	public void fly(int...lengths){ }
	public static void main(String[] args){
		OverloadingVarargsEx ex1 = new OverloadingVarargsEx();
		ex1.fly(new int[] {1, 2, 3});
//		ex1.fly(1, 2, 3);		
	System.out.println();
	}
}
