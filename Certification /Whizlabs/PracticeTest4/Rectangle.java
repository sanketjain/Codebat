public class Rectangle{
	public int width;
	public int height;
	public int area;

	public Rectangle(){}

	protected Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}

	private Rectangle(int area){
		this.area = area;
	}

}

class Square extends Rectangle{
	public static void main(String[] args){
		Square s1 = new Square();
//		Square s2 = (Square) (new Rectangle(0,0));
	}

}