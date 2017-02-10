//Caution: Danger zone ahead

public class InfiniteFor {
	public static void main(String[] args){
		for (int i = 0; i<10 ;) {
			i = i++;
			System.out.println("Hello World");
		}
	}
}