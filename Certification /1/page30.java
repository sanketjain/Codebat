
public class page30 {

	public void findAnswer(boolean check){
		int answer = 20;
		int onlyOneBranch = 12;
		if(check){
			onlyOneBranch = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);
		System.out.println(onlyOneBranch);
	}

	public static void main(String[] args){
		System.out.println("Hello World");
		findAnswer(false);
	}
}
