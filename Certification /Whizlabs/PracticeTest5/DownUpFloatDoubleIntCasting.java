public class DownUpFloatDoubleIntCasting{

	public static void main(String[] args){
		float f = 12.0f;
		System.out.println(f);
		double d = f++;
		System.out.println(d);
		System.out.println(f);

		long l = 12;
		System.out.println(l);
		d--;
		System.out.println(d);
		d-=0.3;
		System.out.println(d);

		System.out.println(f==d);
		System.out.println(d==l);
	}
}