import java.util.*;

public class RemoveDuplicates {

   public static void main(String args[]) {
      // Create a tree set
      TreeSet ts = new TreeSet();
     
      // Add elements to the tree set
      ts.add("C");
      ts.add("A");
      ts.add("B");
      ts.add("E");
      ts.add("F");
      ts.add("A");
      System.out.println(ts);
   }
}