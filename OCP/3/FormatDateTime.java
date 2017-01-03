import java.time.*;
import java.time.format.*;

public class FormatDateTime{
	public static void main(String[] args){
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfYear());
		System.out.println();

		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println();

		DateTimeFormatter shortdt = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortdt.format(dateTime));
		System.out.println(shortdt.format(date));
//		System.out.println(shortdt.format(time)); //UnsupportedTemporalTypeException	
		System.out.println();

		DateTimeFormatter evensdt = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(dateTime.format(evensdt));
		System.out.println(date.format(evensdt));
//		System.out.println(time.format(evensdt)); //UnsupportedTemporalTypeException
		System.out.println();

		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime));
		System.out.println(mediumF.format(dateTime));
		System.out.println();

		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy; hh:mm");
		System.out.println(dateTime.format(f));
		System.out.println();

		DateTimeFormatter d = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate dated = LocalDate.parse("01 02 2015", d);
		LocalTime timed = LocalTime.parse("11:22");
		System.out.println(dated);
		System.out.println(timed);

	}
}
