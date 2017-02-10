public class Duplicacy{
	static int number;
	Duplicacy() { number++; }
	public static void main(String[] args){
		Duplicacy x = new Duplicacy();
		if(false){
			Duplicacy y = new Duplicacy();
		} else {
			Duplicacy y = new Duplicacy();
		}
		Duplicacy y = new Duplicacy();
		System.out.println(x.number);
	}
}