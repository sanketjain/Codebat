/** * Java Program to show that you can overload main method in Java * but you cannot override main method. * * @author Javin Paul */ 

public class MainOverload { 
	
	public static void main(String[] args) { 
		System.out.println("Inside main(String[] args) method ...."); 
	} 
	/** * An overloaded main method which accepts Integer[] instead of * String[] as argument. * @param args */ 
	public static void main(Integer[] args){ 
		System.out.println("Inside main(Integer[] args) method ...."); 
	} 
	/** * Another overloaded main method which accepts Double[] instead of * String[] as argument. * @param args */ 
	public static void main(Double[] args){ 
		System.out.println("Inside main(Double[] args) method ...."); 
	} 
} 
