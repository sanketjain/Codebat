import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LDTExample{
	public static void main(String[] args){
		LocalTime lt = LocalTime.of(12, 30);
		LocalDate ld = LocalDate.of(2015, 2, 21);
		LocalDateTime ldt = lt.atDate(ld);
		System.out.println(ldt.getYear() + "/" + ldt.getMonthValue() + "/" + ldt.getDayOfWeek());
		ldt.minusYears(2);
		ldt.minusDays(2);
		System.out.println(ldt.getYear() + "/" + ldt.getMonthValue() + "/" + ldt.getDayOfWeek());
	}
}
