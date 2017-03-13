import java.util.Random;
//Can also use wildcard
//import java.util.*;

public class ImportExample{
	public static void main(String[] args){
		for(int i=0; i<100; i++){
			Random r = new Random();
			System.out.println(r.nextInt(10));			
		}
	}
}