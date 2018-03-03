public class InterfaceExample{
	public static void main(String[] args){
		I i = new I(){};
		System.out.println(I.x + i.getValue());
	}

	interface I{
		int x =10;

		public default int getValue(){
			return 5;
		}
	}
}