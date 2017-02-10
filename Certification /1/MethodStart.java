public class MethodStart {
	public static void main(String[] args){


		System.out.println("Line 1");
		System.out.print("\n");

	}

//	Access Modifier: public, protected, private and default 
	public void walk1(){} 
//	default void walk2(){} //modifier default not allowed here. Default is a keyword in "while" loop
//	void public walk3(){} //cannot write access modifier after return type
	void walk4(){}
	public void walk5(){}

	public final void walk6(){}
	public final static void walk7(){}
	public static final void walk8(){}
//	public modifier void walk9(){} //would not work as modifier is not the keyword
//	public void final walk10(){} //return type before optinal parameter is difficult
	final public void walk11(){} //Imp: Special type of modifier used here. 	
 
	

 }
