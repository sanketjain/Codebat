public class SecondLargest{
	public static void main(String[] args){
		int[] elements  = {0 , 2 , 10 , 3, -3 }; 
		int smallest = elements[0];
		int secondSmallest = 0;

		for(int i=0; i<elements.length; i++){
			if(secondSmallest >= elements[i]){
				secondSmallest = elements[i];
				if (smallest >= secondSmallest){
					int temp = smallest;
					smallest = secondSmallest;
					secondSmallest = temp;
				}
			}
		}

		System.out.println(smallest);
		System.out.println(secondSmallest);

	}
}