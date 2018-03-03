import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class FindTime{
	public static void main(String[] args){
		LocalTime lt = LocalTime.of(22, 10);
		lt = lt.truncatedTo(ChronoUnit.HALF_DAYS);
		System.out.println(lt);
	}
}