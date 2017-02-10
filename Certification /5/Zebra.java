public class Zebra extends Animal1{

	public Zebra(int age){
		super(age); //Call to Animal1 constructor
		System.out.println("Inside Zebra(int age) and after super(age)"); //Does not print, don't know wny
	}

	public Zebra(){
		this(4); //Call to another constructor in class using this
		System.out.println("Inside Zebra() and just after this(4)");
	}

	public static void main(String[] args){
		new Zebra(); //Call to no argument constructor Zebra();
	}

}
