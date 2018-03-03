public class CalculatePower{
	public static void main(String[] args){
		System.out.println(power(.5, 2));
		System.out.println(power(2.5, 2));
		System.out.println(power(5, 2));
	}	

	public static double power(double x, int n){
		double temp;
		if(n==0){
			return 1;
		}
		temp = power(x, n/2);
		if(n%2==0){
			return temp*temp;
		} else {
			if(n>0){
				return x*temp*temp;
			} else {
				return (temp*temp)/x;
			}
		}
	}
}