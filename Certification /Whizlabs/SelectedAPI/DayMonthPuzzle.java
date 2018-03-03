import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;

public class DayMonthPuzzle{
	
	public static void main(String[] args){
		Year y = Year.of(2015);
		LocalDate date = y.atMonthDay(MonthDay.of(4, 31));
		//30 would work
		System.out.println(date);
	}

}