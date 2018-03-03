public class InterfaceExtention{
	public static void main(String[] args){
		System.out.println(In2.print());
	}	
}

interface In1 {
	public static void print(){
		System.out.println("In1");
	}
}

interface In2 {
	static String print(){
		return "In2";
	}
}

/*
Java 8 includes support for static methods within interfaces. 
These methods are defined explicitly with the static keyword and 
function nearly identically to static methods defined in classes. 
In fact, there is really only one distinction between a static method 
in a class and an interface. A static method defined in an interface is 
not inherited in any classes that implement the interface and  
even not inherited  to it's sub interfaces. 
So there won't be any compile time error at line 14. 
*/