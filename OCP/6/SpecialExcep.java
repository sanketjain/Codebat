public class SpecialExcep {


	public String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before ";
				v.length();
				result += "after ";
			} catch (NullPointerException e){
				result += "catch ";
				throw new RuntimeException();
			} finally {
				result += "finally ";
				throw new Exception();
			}
		} catch (Exception e){
			result += "done";
		}
		return result; 
	}

	public static void main(String[] args){
		SpecialExcep sexp = new SpecialExcep(); 
//		sexp.exceptions();
		System.out.println(sexp.exceptions());
	}
}

