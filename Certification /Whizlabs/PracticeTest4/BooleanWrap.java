public class BooleanWrap{
	public static void main(String[] args){
		Boolean b1 = Boolean.valueOf(true);
		Boolean b2 = Boolean.parseBoolean("yes");
		Boolean b3 = Boolean.getBoolean("FALSE");
		System.out.println("" + b1 + b2 + b3);
	}
}
