import java.time.*;

public class PeriodUpdate{
	public static void main(String[] args){
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
//		Period period = Period.ofMonths(1);
//		Period period = Period.ofYears(1);
//		Period period = Period.ofWeeks(3);
//		Period period = Period.ofDays(10);
		Period period = Period.of(0, 1, 7); //year, month, date
		performAnimalEnrichment(start, end, period);
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period){
		LocalDate upTo = start;
		while (upTo.isBefore(end)){
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);
		}
	}
}
