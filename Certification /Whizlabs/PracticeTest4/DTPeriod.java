import java.time.Period;

public class DTPeriod{

	public static void main(String[] args){
		Period p1 = Period.ofYears(1);
		Period p2 = Period.of(0,1,0);
		Period p3 = p2.plus(p1);
		System.out.println(p3.getDays());
	}
}
