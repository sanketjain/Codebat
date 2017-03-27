import java.io.*;
import java.util.*;

public class MostDistant {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        List<Integer> listX = new ArrayList<Integer>();
        List<Integer> listY = new ArrayList<Integer>();
                
        for(int i=0; i<t; i++){
            listX.add(scan.nextInt());
            listY.add(scan.nextInt());       
        }
        
        Collections.sort(listX);
        Collections.sort(listY);

        long maxDifferenceX = listX.get(listX.size() - 1) - listX.get(0) ;
        //System.out.println(maxDifferenceX);
        long maxDifferenceY = listY.get(listY.size() - 1) - listY.get(0) ;
        if(maxDifferenceY>maxDifferenceX){
            System.out.println(maxDifferenceY);
        } else {
            System.out.println(maxDifferenceX);
        }
    }
}