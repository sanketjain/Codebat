public class SumWithDouble{
	public static void main(String[] args){
		double sum = 0.0;
		for(int i=0; i<1000; i++){
			sum = sum + 0.1;
	//		System.out.println("Sum is: " + sum );
		}
		if(sum==100){
			System.out.println("Sum is: " + sum + " equals 100");
		} else {
			System.out.println("Sum is: " + sum + " not equals 100");
		}
	}
}