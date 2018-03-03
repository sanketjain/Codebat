public class SBSize{
	public static void main(String [] args){
		StringBuilder s = new StringBuilder("Iz0");
		System.out.println(s.capacity());
		s.append("-808");
		System.out.println(s.capacity());
		System.out.println(s.length());
	}
}