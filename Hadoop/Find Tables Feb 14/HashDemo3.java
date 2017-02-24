import java.io.FileReader;
import java.util.*;
import java.io.File;
import java.io.BufferedReader;


public class HashDemo3 {
   public static void main(String[] args) throws Exception {

    //Read table file
    Scanner tablefile = new Scanner(new File("/Users/sanketjain/Documents/Java-Codes/Hadoop/Find Tables Feb 14/sample_table.txt"));
    Set<String> tablenames = new HashSet<>(); //Create HashSet
    while (tablefile.hasNext()) {
        tablenames.add(tablefile.next().trim()); //Add to HashSet        
    }    
    
    //Read query file
    String currentLine = null;
    int i=1;
    BufferedReader queryFile = new BufferedReader(new FileReader(new File("/Users/sanketjain/Documents/Java-Codes/Hadoop/Find Tables Feb 14/sample_query_input.txt")));       
   
    while ((currentLine = queryFile.readLine()) != null) {
      System.out.println();
      String modification1currentLine = currentLine + " | ";
    //  System.out.println(modification1currentLine);
      for (String table : tablenames) {
        String fullName = table;
    
        if(currentLine.contains(table)){
        //  System.out.println(table);
        //Code to find the full name, given the query and tablename
          int indexOfTableString = currentLine.indexOf(table);
          String subquery = currentLine.substring(0, indexOfTableString);
          int indexofSpace;
          String reverseSubquery = new StringBuilder(subquery).reverse().toString();
          if(reverseSubquery.contains(" ")){
            indexofSpace = reverseSubquery.indexOf(" ");
            String reverseHalfName = reverseSubquery.substring(0, indexofSpace);
            String halfName = new StringBuilder(reverseHalfName).reverse().toString();
            fullName = halfName + table;
          }
        modification1currentLine = modification1currentLine + fullName + ", ";
        }
      }

      int len = modification1currentLine.length();
      String finaloutputline = modification1currentLine.substring(0, (len - 2));
      System.out.println(finaloutputline);
    }


  }
}