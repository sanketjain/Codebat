public class IntToString{
	public static void main(String[] args){
		int[] nums = new int[]{6, 9, 1};
		Object x = nums;
		String[] two = (String[]) x;
		System.out.println(two[two.length]);
	}
}