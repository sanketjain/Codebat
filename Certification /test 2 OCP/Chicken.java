public class Chicken{
	private void layEggs (int... eggs){
		System.out.println("many " + eggs[0] + " ");		
	}
	private void layEggs (int eggs){
		System.out.println("one " + eggs + " ");		
	}
	public static void main(String[] args){
		Chicken c = new Chicken();
		c.layEggs(1, 2);
		c.layEggs(3);
		c.layEggs(new Integer(2));
	}
}