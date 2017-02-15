
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class BufferedReaderDemo0 {
   public static void main(String[] args) throws Exception {

     String thisLine = null;
      try{
         // open input stream InputFile.txt for reading purpose.
         BufferedReader br = new BufferedReader(new FileReader(new File("/Users/sanketjain/Documents/Codingbat - Java/Hadoop/InputFile.txt")));
         while ((thisLine = br.readLine()) != null) {
            System.out.println(thisLine);
            
         }       
         br.close();
      }catch(Exception e){
         e.printStackTrace();
      }
   }
}