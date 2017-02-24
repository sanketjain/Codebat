import java.io.FileReader;
import java.util.*;
import java.io.File;
import java.io.BufferedReader;


public class HashDemo {
   public static void main(String[] args) throws Exception {

    Scanner tablefile = new Scanner(new File("/Users/sanketjain/Desktop/anand hadoop/sample_table.txt"));
    Set<String> tablenames = new HashSet<>();
    // For each word in the input
    while (tablefile.hasNext()) {
        // Trim it and insert into the set
        tablenames.add(tablefile.next().trim());        
    }    
    //Check that we have correct hashset of table names
//    for (String table : tablenames) { System.out.println(table); }

    
    //Read query file
    String currentLine = null;
    int i=1;
    BufferedReader queryFile = new BufferedReader(new FileReader(new File("/Users/sanketjain/Desktop/anand hadoop/sample_query_input.txt")));       
    
    while ((currentLine = queryFile.readLine()) != null) {
    //   System.out.println("Line" + i + ": "); i++;
    //   System.out.println(currentLine);
       String modification1currentLine = currentLine + "| ";
    //   System.out.println(modification1currentLine);
       System.out.println();
      
        for (String table : tablenames) {
          if(currentLine.contains(table)){
          //  System.out.println(table);
            modification1currentLine = modification1currentLine + table + ", ";
          }
        }

        int len = modification1currentLine.length();

        String finaloutputline = modification1currentLine.substring(0, (len - 2));
        System.out.println(finaloutputline);
    }




  }
}