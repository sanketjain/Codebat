public class CheckXYHashCode{
	public static void main(String [] args){
		Integer x = 12;
		Integer y = 12;
		System.out.println(x.equals(y));
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
	}
}