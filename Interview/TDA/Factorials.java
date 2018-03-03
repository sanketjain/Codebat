//12:28 pm to 12:44pm

public class Factorials{
	public static void main(String[] args){
		nonRecursive(0);
		System.out.println();
		nonRecursive(1);
		System.out.println();
		nonRecursive(30);
	}

//Eg: 30: 1, 2, 3, 5, 6, 10, 15

	public static void nonRecursive(int n){
		if(n==0){
			System.out.println("0, 1");
		}

		if(n==1){
			System.out.println("1");
		}

		for(int factor = 1; factor <= n/2; factor++){
			if(n % factor == 0){
				System.out.println(factor);
			}
		}
	}

}