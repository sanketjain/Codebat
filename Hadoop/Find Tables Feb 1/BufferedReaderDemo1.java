
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;

public class BufferedReaderDemo1 {
   public static void main(String[] args) throws Exception {
	  List<String> arrlst = new ArrayList<String>();
	  int i = 0;
	  String thisLine = null;
      try{
         // open input stream InputFile.txt for reading purpose.
         BufferedReader br = new BufferedReader(new FileReader(new File("/Users/sanketjain/Documents/Codingbat - Java/Hadoop/InputFile.txt")));
         while ((thisLine = br.readLine()) != null) {
            System.out.println(thisLine);
            arrlst.add(i, thisLine);
            i++;            
         }       
         br.close();
      }catch(Exception e){
         e.printStackTrace();
      }
      System.out.println(arrlst);
   }
}