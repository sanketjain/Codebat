import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeQuestion{
	public static void main(String [] args){

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/mm/dd");
		LocalDateTime ldt = LocalDateTime.of(2015,10,10,11,22);
		System.out.println(dtf.format(ldt));
	}
}