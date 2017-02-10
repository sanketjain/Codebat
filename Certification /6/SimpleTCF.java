public class SimpleTCF {
	public static void main(String[] args){
		String s = "";
		try {
			s += "t";
//		System.exit(0);
		} catch (Exception e){
			s += "c";
		} finally {
			s += "f";
		}
		s += "a";
		System.out.println(s);
	}
}

