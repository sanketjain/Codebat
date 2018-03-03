class Fish{
	private int age;
	protected int size;
	public Fish(int age){ this.age = age; }
	public int getAge(){ return age; }
}


public class Shark extends Fish{
	private int numberOfFins = 8;
	public Shark(int age){
		super(age);
		this.size = 4;
	}

	public void displaySharkDetails1(){
		System.out.println("Shark with age: " + getAge());
		System.out.println("Shark with size: " + size);
		System.out.println("Shark with numberOfFins: " + numberOfFins);
	}
	public void displaySharkDetails2(){
		System.out.println("Shark with age: " + this.getAge());
		System.out.println("Shark with size: " + this.size);
		System.out.println("Shark with numberOfFins: " + this.numberOfFins);
	}
	public void displaySharkDetails3(){
		System.out.println("Shark with age: " + super.getAge());
		System.out.println("Shark with size: " + super.size);
		System.out.println("Shark with numberOfFins: " + numberOfFins);
	}
	public static void main(String[] args){
		Shark s1 = new Shark(0);
		s1.displaySharkDetails1();		
		s1.displaySharkDetails2();
		s1.displaySharkDetails3();
	}
}