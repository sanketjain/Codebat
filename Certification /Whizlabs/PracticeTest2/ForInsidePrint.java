public class ForInsidePrint{

	public static void main(String[] args){
		new ForInsidePrint().iterator(new int[]{10, 12, 13});
	}

	void iterator(int[] i){
		for(int x=0; x<i.length; System.out.print(i[x] + " "))
			x++;
	}

}
