import java.util.Date;

//This code is taken from JavaRevisited Blog. All information is for study porpose.

public class StaticTest {

    public static void main(String args[]) {
      
        // calling non static method from main in Java
        //printCurrentTime(); //compile time error - can not call non static method from main
      
        StaticTest test = new StaticTest();
        test.printCurrentTime();
      
    } 
  
  
    public void printCurrentTime(){
       System.out.println(new Date());
    }
}
