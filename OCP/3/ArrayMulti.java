public class ArrayMulti{
	public static void main(String[] args){
		int[][] vars1; //2D array
		int vars2 [][]; //2D array
		int[] vars3[]; //2D array
		int[] vars4 [], space [][]; //2D and 3D array
		String [][] rectangle = new String [3][2];
		rectangle[0][1] = "set";
		System.out.print("\n");


		int[][] args1 = new int[4][];
		System.out.println(args1.length);
		args1[0] = new int[5];
		args1[1] = new int[3];
		for (int i = 0; i<args1[0].length; i++){
			System.out.print(args1[0][i] + " ");
		} 
		System.out.print("\n");
		for (int i = 0; i<args1[1].length; i++){
			System.out.print(args1[0][i] + " ");
		}
		System.out.print("\n");
	}
}

