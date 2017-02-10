public class Switch1 {
	public static void main(String[] args){
		int dayOfweek = 5;
		switch(dayOfweek){
			case 0:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Weekday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
		}
	}
}