public class Chick{
	private static String name = "Fluffy";
	
	{
		System.out.println("setting field");
		System.out.println(name);
	}

	public Chick(){
		name = "Tiny";
		System.out.println("setting Constructor");
	}

	public static void main(String[] args){
		Chick chick = new Chick();
		System.out.println(chick.name);
	}

}