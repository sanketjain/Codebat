public class LeapYear{
	public static void main(String[] args){
		int checkLeapYear = Integer.parseInt(args[0]);
		if (checkLeapYear%4 == 0){
			if(checkLeapYear%100 == 0 ){
				if(checkLeapYear%400 == 0){
					System.out.println("Leap Year");
				} else {
					System.out.println("not a Leap Year");
				}
			} else {
				System.out.println("Leap Year");
			}
		} else {
			System.out.println("not a Leap Year");
		}
	}	
}
