public class Animal1 {
	private int age;
	public Animal1(int age){
		super(); //Calls the parent constructor defined in java.lang.Object
		this.age = age;
		System.out.println("Inside Animal1 and age is - " + this.age); //Does not print, don't know why
	}
}
