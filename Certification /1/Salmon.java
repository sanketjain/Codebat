public class Salmon{
	int count;

	//Imp: The following is a valid method and not a constructor:
	public void Salmon() {
		count = 4;
	}

	public static void main(String[] args){
		Salmon s = new Salmon();
		System.out.println(s.count);
	}

}
