public class PassByValueSB{
	public static void main(String[] args){
		StringBuilder name = new StringBuilder();
		name.append("Webby");
		speak(name);
		System.out.println(name);
	}

	public static void speak(StringBuilder s){
		s.append("Ola");
	}
}

