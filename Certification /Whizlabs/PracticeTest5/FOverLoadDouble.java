public class FOverLoadDouble{
	public void test(int i){
		System.out.println(i);
	}

	public void test(float i){
		System.out.println(i);
	}

	public static void main(String[] args){
		FOverLoadDouble obj = new FOverLoadDouble();
		obj.test(1.0f);
	}
}