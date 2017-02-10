import java.time.*;

class CanBeUsed {
	public static void main(String[] args){
		LocalDate date3 = LocalDate.of(2015, 1, 20);
		LocalTime time3 = LocalTime.of(6, 15);
		LocalDateTime dateTime3 = LocalDateTime.of(date3, time3);
		Period period = Period.ofMonths(1);
		System.out.println(date3.plus(period));
		System.out.println(dateTime3.plus(period));
//		System.out.println(time3.plus(period)); //Unsupported type
	}
}
