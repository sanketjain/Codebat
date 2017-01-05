public class PassByValueSB{
	public static void main(String[] args){
		StringBuilder name = new StringBuilder();
		speak(name);
		System.out.println(name);
	}

	public static void speak(StringBuilder s){
		s.append("Ola");
	}
}

