public class Bunny {
	private String color;
	private int length;
	private int height;

	public Bunny(int length, int theHeight){
		length = this.length; //backwards, not good. Watch it!
		height = theHeight;
		this.color = "white";
	}

	public static void main(String[] args){
		Bunny b = new Bunny(1, 2);
		System.out.println(b.length + " " + b.height + " " + b.color);
	}
}