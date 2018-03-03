public class SwitchArray{

	public static void main(String[] args){
		final int[] array = {1,2,3};
		switch(2){
			case array[0]: {System.out.println("A");}
			case array[1]: System.out.println("B");
			default: System.out.println("default"); break;
			case array[2]: System.out.println("C");		
		}
	}
	//Does not compile as the array is final but 
	//the elements of array are not
}
