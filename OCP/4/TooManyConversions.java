public class TooManyConversions {
	
	public static void play(Long l){	}
	public static void play(Long...l){	}
		
	public static void main(String[] args){
		//play(4); //Does not compile cuz int 4 to Integer 4 is one conversion
		//and Integer 4 to Long 4 is second conversion
		//Also int 4 to long 4 would be one. long 4(primitive) to Long 4(Object) would be second
		play(4l);
		play(4L);
		System.out.println();
	}
}

