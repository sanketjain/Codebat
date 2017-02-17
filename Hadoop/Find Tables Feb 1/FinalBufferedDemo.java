
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;

public class FinalBufferedDemo {
   public static void main(String[] args) throws Exception {
    List<String> arrlst = new ArrayList<String>();
    List<String> viewList = new ArrayList<String>();
    int viewListCount = 0;
    int tableListCount = 0;
    List<String> tableList = new ArrayList<String>();
    List<String> tableList2 = new ArrayList<String>();
    int i = 0;
    String thisLine = null;
    String firstSubString, thirdSubString, fourthSubString;
    String thirdSubStringt, fourthSubStringt;
      try{
         // open input stream InputFile.txt for reading purpose.
         BufferedReader br = new BufferedReader(new FileReader(new File("/Users/sanketjain/Documents/Java-Codes/Hadoop/Find Tables Feb 1/InputFile.txt")));       
         while ((thisLine = br.readLine()) != null) {
            System.out.println(thisLine);
       
            if (thisLine.contains("VIEW")){
                viewListCount++;
                int indexofview = thisLine.indexOf("VIEW");
              firstSubString = thisLine.substring(indexofview+4);
              String secondSubString = firstSubString.trim();
              int indexofspace = secondSubString.indexOf(" ");
              thirdSubString = secondSubString.substring(0, indexofspace);
  
              if(thirdSubString.contains(".")){
                int indexofdot = thirdSubString.indexOf(".");
                fourthSubString = thirdSubString.substring(indexofdot+1);
                System.out.println("View is " + fourthSubString);
                viewList.add(fourthSubString);
              } else {
                fourthSubString = thirdSubString;
                  viewList.add(fourthSubString);     
                System.out.println("View is " + fourthSubString);
              }            
            }
            
            
            
            
            
          //Code for tables  
            
            
            
            
            if (thisLine.contains("FROM")){
                tableListCount++;
                int indexoffrom = thisLine.indexOf("FROM");
                firstSubString = thisLine.substring(indexoffrom+4);
//                System.out.println(firstSubString);
                String secondSubString = firstSubString.trim();
//                System.out.println(secondSubString);
 
                if(!(secondSubString.contains("JOIN"))){
                    if(secondSubString.contains(" ")){
                      int indexofspace = secondSubString.indexOf(" ");
                      thirdSubStringt = secondSubString.substring(0, indexofspace);                 
                    } else {
                      thirdSubStringt = secondSubString.substring(0, (secondSubString.length()-1));
                    }
                    if(thirdSubStringt.contains(".")){
                    int indexofdot = thirdSubStringt.indexOf(".");
                    fourthSubStringt = thirdSubStringt.substring(indexofdot+1);
                    System.out.println("Table is " + fourthSubStringt);
                    tableList.add(fourthSubStringt);
                  } else {
                    fourthSubStringt = thirdSubStringt;
                      tableList.add(fourthSubStringt);     
                    System.out.println("Table is " + fourthSubStringt);
                  }            
                } else {
                  
                  String firstinner = secondSubString;
  //                System.out.println(firstinner);
                  if(firstinner.contains(" ")){
                      int indexofspace = firstinner.indexOf(" ");
                      thirdSubStringt = firstinner.substring(0, indexofspace);                  
                    } else {
                      thirdSubStringt = secondSubString;
                    }
                    if(thirdSubStringt.contains(".")){
                    int indexofdot = thirdSubStringt.indexOf(".");
                    fourthSubStringt = thirdSubStringt.substring(indexofdot+1);
                    System.out.println("Table is " + fourthSubStringt);
                    tableList.add(fourthSubStringt);
                  } else {
                    fourthSubStringt = thirdSubStringt;
                      tableList.add(fourthSubStringt);     
                    System.out.println("Table is " + fourthSubStringt);
                  }
                    
                    String secondInner = secondSubString;
                    int indexOfJoin = secondInner.indexOf("JOIN");
                    String secondInnerFirstSubString = secondInner.substring(indexOfJoin);
                    
                    String secondInnerSecondSubString = secondInnerFirstSubString.substring(indexOfJoin+4);
                  String secondInnerThirdSubString = secondInnerSecondSubString.trim();
                  int indexOfSpace = secondInnerThirdSubString.indexOf(" ");
                  String secondInnerFourthSubString = secondInnerThirdSubString.substring(0, indexOfSpace);
      
                  if(secondInnerFourthSubString.contains(".")){
                    int indexOfDot = secondInnerFourthSubString.indexOf(".");
                    String secondInnerFifthSubString = secondInnerFourthSubString.substring(indexOfDot+1);
                    System.out.println("Table2 is " + secondInnerFifthSubString);
                    tableList2.add(secondInnerFifthSubString);
                  } else {
                    String secondInnerFifthSubString = secondInnerFourthSubString;
                      tableList2.add(secondInnerFifthSubString);     
                    System.out.println("Table2 is " + secondInnerFifthSubString);
                  }
                                      
                  
                }
                
                
                
            }
            
            
            
            
            arrlst.add(i, thisLine);            
            i++;            
         }       
         br.close();
      }catch(Exception e){
         e.printStackTrace();
      }
      //To check what is inside the input list
//      System.out.println(arrlst);
      System.out.println();
      System.out.println("Final output currently in form of arrays: ");

      System.out.println("View List is "+ viewList);
//    System.out.println(viewListCount);
    System.out.println("Table 1 is: " + tableList);
 //   System.out.println(tableListCount);
    System.out.println("Table 2 is: " + tableList2);
    
   }
}