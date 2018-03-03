interface I{
	public default void print(){
		System.out.print("I");
	}

	static void method(){
		System.out.print("Static");	
	}
}