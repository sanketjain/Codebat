import java.io.FileReader;
import java.util.*;
import java.io.File;
import java.io.BufferedReader;


public class HashDemo1 {
   public static void main(String[] args) throws Exception {

    Scanner tablefile = new Scanner(new File("/Users/sanketjain/Desktop/anand hadoop/Table_list.txt"));
    Set<String> tablenames = new HashSet<>();
    // For each word in the input
    while (tablefile.hasNext()) {
        // Trim it and insert into the set
        tablenames.add(tablefile.next().trim());        
    }    
    
    //Read query file
    String currentLine = null;
    int i=1;
    BufferedReader queryFile = new BufferedReader(new FileReader(new File("/Users/sanketjain/Desktop/anand hadoop/Queries.txt")));       
    
    while ((currentLine = queryFile.readLine()) != null) {
    //   System.out.println("Line" + i + ": "); i++;
    //   System.out.println(currentLine);
       String modification1currentLine = currentLine + "| ";
       String modification2currentLine = ""; 
       System.out.println(modification1currentLine);
    //   System.out.println();
       int indexofspace = 0;
      
        for (String table : tablenames) {
          if(currentLine.contains(table)){
            System.out.println(table);  
            int indexoftable = currentLine.indexOf(table);

            if(currentLine.charAt(indexoftable-1) == '.'){
              String subtilldot = currentLine.substring(0, indexoftable);
              System.out.println(subtilldot);
              System.out.println();
              String subtilldot2 = subtilldot;

              while(subtilldot2.contains(" ")){
                indexofspace = indexofspace + subtilldot.indexOf(" ");
                subtilldot2= subtilldot2.substring(indexofspace);
              }
              System.out.println(indexofspace);
              



            } else {
                modification2currentLine = modification1currentLine + table + ", ";
            }

          }          
        }

        int len = modification2currentLine.length();

  //      String finaloutputline = modification2currentLine.substring(0, (len - 2));
 //       System.out.println(finaloutputline);
    }

  }
}
