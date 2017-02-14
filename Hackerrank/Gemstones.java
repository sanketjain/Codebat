import java.io.*;
import java.util.*;

public class Gemstones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. 
        rint output to STDOUT. Your class should be named
        Solution. */
        
		List<String> listStr = new ArrayList<String>();

        Scanner in = new Scanner(System.in);
        int noOfStrings = Integer.parseInt(in.nextLine());
        int finalcount = 0;
        for(int i = 0; i < noOfStrings; i++){
            String x = in.nextLine();
            for(char ch = 'a'; ch<='z'; ch++){
            	String str = String.valueOf(ch);
            	if (x.contains(str)){
            		char y = ch;
            		listStr.add(str);
            	}
            }
        }
        
       
        Collections.sort(listStr);
        int count = 1;

        String currstr = listStr.get(0);
        for(int k=1; k<listStr.size(); k++){
        	if(listStr.get(k).equals(currstr)){
        		count = count + 1;
        	  	if(count==noOfStrings){
   	        		finalcount = finalcount + 1;
   	        	}
        	} else{
        		count = 1;
        		currstr = listStr.get(k);
        	}
        }
        System.out.println(finalcount);

    }
}

