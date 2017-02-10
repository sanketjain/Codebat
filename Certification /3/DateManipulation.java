import java.time.*;

public class DateManipulation{
	public static void main(String[] args){	
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);	
		System.out.println(date);
		date = date.plusDays(2);
		System.out.println(date);
		date = date.plusWeeks(1);
		System.out.println(date);
		date = date.plusMonths(1);
		System.out.println(date);
		date = date.plusYears(5);
		System.out.println(date);

		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);	
		LocalTime time1 = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date1, time1);
		System.out.println(dateTime);
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime);
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime);
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime);

		//Method chaining example
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1).minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println(dateTime1);
	}
}
