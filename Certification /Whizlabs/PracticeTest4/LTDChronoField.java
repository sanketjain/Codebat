import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LTDChronoField{

	public static void main(String[] args){

		LocalTime lt = LocalTime.of(2,2,15);
		System.out.println(lt.getLong(ChronoField.valueOf("MINUTE_OF_DAY")));
	}
}
