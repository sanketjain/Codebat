interface S1 {
	default void imethod(){
		System.out.println("inside interface S1");
	}
}

interface S2{
	default void imethod(){
		System.out.println("inside interface S2");
	}
}


public class ChildOfInterface implements S1, S2{
	// public void imethod(){
	// 	System.out.println("inside class ChildOfInterface");	
	// }

	public void imethod(){
		S2.super.imethod();
	}
		

	public static void main(String[] args){
		ChildOfInterface ch = new ChildOfInterface();
		ch.imethod();
	}
}

