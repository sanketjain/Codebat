public class Zebra extends Animal1{

	public Zebra(int age){
		super(age); //Call to Animal1 constructor
		System.out.println("Inside Zebra"); //Does not print, don't know wny
	}

	public Zebra(){
		this(4); 
	}

	public static void main(String[] args){
		new Zebra();
	}

}
