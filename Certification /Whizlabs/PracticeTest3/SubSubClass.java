public class SubSubClass extends SubClass{

	SubSubClass(String s){
		super();
		System.out.println("SubSubClass");
	}

	public static void main(String[] args){
		new SubSubClass("ABC");
	}

}


class MainClass{
	MainClass(){
		System.out.println("MainClass");
	}
}

class SubClass extends MainClass{

	{System.out.println("Normal Block SubClass");}
	
	static{ System.out.println("Static block of SubClass"); }

	SubClass(int i){
		this();
		System.out.println("SubClass int constructor");
	}

	SubClass(){
		super();
		System.out.println("SubClass noagrument constructor");
	}

}

