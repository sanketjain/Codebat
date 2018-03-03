public class Program{

	public static void main(String[] args){
		PrintProgram p = new PrintProgram();

		p.p2(6);
//		System.out.println(p.print(6));
	}

}


class PrintProgram{
	static void p2(int i){
		System.out.println(i);
	}

	void print(int i){
		System.out.println(i);
	}
}