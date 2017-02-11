public class Fibonaccigenerate{
	public static void main(String[] args){
		long x = 100L;
		long nexta  = 0L;
		long a1 =1L, a2=2L;
		long sum = a2;

		while(nexta<=x){
			nexta = a1 + a2;
			if(nexta<=x){
				System.out.println(nexta);
				if((nexta%2)==0){
					sum = sum + nexta;
				}
			}
			a1 = a2;
			a2 = nexta;
		}
	System.out.println(sum);	

	}
}