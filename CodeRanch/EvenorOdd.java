public class EvenorOdd{
	public static void main(String[] args){
		int count = Integer.parseInt(args[0]);

		if(count%2 == 0){
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}	
}

