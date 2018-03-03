public class CompileOrException{
	public static void main(String[] a){
		int[] a = {1,2,3};
		System.out.println(a[3]);
	}	
}

//Trick: Trying to re-declare the existing array a on 
//line 3 causes error as it is already declared on line 2
