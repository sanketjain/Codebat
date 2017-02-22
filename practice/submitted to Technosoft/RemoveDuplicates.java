import java.util.*;
import java.io.FileReader;
import java.io.File;

public class RemoveDuplicates {

   public static void main(String args[]) throws Exception{
      
   //Scan a file
   Scanner tablefile = new Scanner(new File("/Users/sanketjain/Documents/Java-Codes/Hadoop/Find Tables Feb 14/sample_table.txt")); //Change path inside quotes to your dataset file location
   //Create HashSet
   Set<String> tablenames = new HashSet<>();
   //Add to HashSet   
   while (tablefile.hasNext()) {
       tablenames.add(tablefile.next());     
   }    

   // The problem is solved. The set named tablenames contains data without duplicates. Depending on requirement I can print them or save it to a file.
   // Question: Why is it solved so quickly? 
   // Answer: I am taking data into a HashSet. In hashing, the informational content of a key is used to determine a UNIQUE VALUE, called its hash code.

   //For debugging purpose, the following line prints the output in console. Remove double slash "//" in next line to uncomment (Note: JVM required)
   // for (String t : tablenames) { System.out.println(t); }


   }
}