public class PassByWhat{
	public static void main(String[] args){
		int[] ary = {1,2,3};
		change(ary[2]);
		change(ary);
		System.out.println(ary[1] + ary[2]);
	}

	public static void change(int x){
		x = 1;
	}

	public static void change(int[] x){
		x[1] = 0;
	}

}