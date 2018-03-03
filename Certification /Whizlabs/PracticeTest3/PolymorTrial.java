public class PolymorTrial{

	public static void main(String[] args){
		Livera s = new Livera("Livera", 22);
		Person p = s;
		s.read();
		p.read();
	}
	
}

class Person{
	int age;
	String name;
	public void read(){
		System.out.print("Person is reading ");
	}
	private void other(){}
}

class Livera extends Person{
	Livera(String s, int i){
		age = i;
		name = s;
	}
	public void read(){
		System.out.print(name + " is reading ");
	}

	public void other() throws Exception{}
}

