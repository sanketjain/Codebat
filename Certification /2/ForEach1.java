public class ForEach1 {
	public static void main(String[] args){
		String[] names = new String[3];
//		for (int name: names){  //Does not compile cuz name is declared as of type int
		for (String name: names){
			System.out.println(name + ", ");
		}

//		System.out.prinln();
	}
}
