public class VariableScope {
	public static void main(String[] args){
		do {
			int y = 1;
			System.out.print(y++ + " ");
		} while (y<=10);
	}
}