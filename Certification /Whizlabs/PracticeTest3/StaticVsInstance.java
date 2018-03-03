public class StaticVsInstance{

	static int i;
	int j;

	StaticVsInstance(){
		j = i++;
	}
	public static void main(String[] args){
		StaticVsInstance s1 = new StaticVsInstance();
		StaticVsInstance s2 = new StaticVsInstance();
		StaticVsInstance s3 = new StaticVsInstance();
		System.out.println(s1.i);
		System.out.println(s2.i);
		System.out.println(s3.i);

		System.out.println(s1.j);
		System.out.println(s2.j);
		System.out.println(s3.j);
	}
}