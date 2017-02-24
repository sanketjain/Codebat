import java.io.*;
import java.util.*;
//Given a string, find if a palindrome can be made using all characters or not

public class GameOfThrones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        String inputStr = in.next(); //Taking input string
        int inputStrLength = inputStr.length();
        String toEdit = inputStr;
        
        //Declare an array
        int[] count = new int[26];
        for(int ic = 0; ic<26; ic++){
        	count[ic] = 0;
        }
		//Create an array of all characters
		char[] allChars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		//for(char ch: allChars){ System.out.println(ch); }

		int indexOfCh = 0;
		String chToStr;

		for (int chCount=0; chCount<26; chCount++){
			for(int j=0; j<inputStrLength; j++){
				chToStr = Character.toString(allChars[chCount]);
				//System.out.println(chToStr);
				if(toEdit.contains(chToStr)){
					int indexofStr = toEdit.indexOf(chToStr);
					toEdit = toEdit.substring(0, indexofStr) + toEdit.substring(indexofStr+1) ;
					count[chCount] = count[chCount] + 1;

				}
			}
		}

		int ethElement = 1;
		int oddCounts = 0;
		for(int m: count){
		//	System.out.println(ethElement + " count is: " + m);
			ethElement++;
			if(m%2!=0){
				oddCounts++;
		//		System.out.println(oddCounts);
			}
		}

		if((oddCounts==0)||(oddCounts==1)){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}



    }
}
