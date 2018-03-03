public class InnerCatch{
	public static void main(String[] args){
		try{
			int x = args.length;
			int v = 10/x;
			System.out.println(x);
			try{
				if(x==1)
					x=x/x - x;
				if(x==2){
					int[] c = {2};
					c[3] = 3;
				}
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Out Of Bouds");
			} catch(ArithmeticException e) {
				System.out.println("Arithmetic");
			}
		} 
	}
}