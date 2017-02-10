public class Gorilla extends Animal3 {
	
	public Gorilla (int age){
		super (age, "Gorilla");
	}

 	public Gorilla() {
 		super(5);
 	}

	public static void main(String[] args){
		Gorilla gorilla1 = new Gorilla(10);
		System.out.println(gorilla1.age);
//		Gorilla gorilla2 = new Gorilla();
//		System.out.println(gorilla2.age);
	}
}
