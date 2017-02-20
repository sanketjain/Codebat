import java.io.FileReader;
import java.util.*;
import java.io.File;
import java.io.BufferedReader;


public class CheckDuplicates{
	public static void main(String[] args) throws Exception{

		Scanner tablefile = new Scanner(new File("/Users/sanketjain/Documents/Java-Codes/practice/CompanyNamesWithDuplicates.txt"));
		Set<String> tablenames = new HashSet<>(); //Create HashSet
	    while (tablefile.hasNext()) {
	        tablenames.add(tablefile.next().trim()); //Add to HashSet        
	    }

		tablenames.forEach(System.out::println);
	}
}