public class PassBoolean{
	public static int howMany(boolean b, boolean... b2){
		return b2.length;
	}

	public static void main(String[] args){
		howMany(true, {true, true});
	}
}