public class PassIntOrShort{

	public static void main(String[] args) throws Exception{
		System.out.println(new PassIntOrShort().check(10));
	}

	boolean check(short x){
		if(x<10) return true;
		else return false;
	}
	
}