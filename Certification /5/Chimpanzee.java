public class Chimpanzee extends Ape{

	public static void main(String[] args){
		new Chimpanzee(); 
		//Parent constructor would be executed, always before the child constructor.
		//So output is: 
		//Primate  
		//Ape.
	}
}

class Primate {
	public Primate(){
		System.out.println("Primate");
	}
}

class Ape extends Primate {
	public Ape(){
		System.out.println("Ape");
	}
}
