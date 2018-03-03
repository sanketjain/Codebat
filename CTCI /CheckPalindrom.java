import java.util.Arrays;

public class CheckPalindrom{

	static boolean isPermutationOfPalindrome(String phrase){
		int[] table = buildCharFrequencyTAble(phrase);
		//System.out.println(Arrays.toString(table));
		return checkMaxOneOdd(table);
	}

	static boolean checkMaxOneOdd(int[] table){
		boolean foundOdd = false;
		for(int count : table){
			if(count % 2 == 1){
				if(foundOdd){ return false; }
				foundOdd = true;
			}
		}
		return true;
	}

	static int[] buildCharFrequencyTAble(String phrase){
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for(char c: phrase.toCharArray()){
			int x = getCharNumber(c);
			if(x != -1){ 
				table[x]++; 
			}
		}
		return table;
	}

	static int getCharNumber(Character c){
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if(a<=val && val<=z){	return val - a; }
		return -1;
	}

	public static void main(String[] args){
		System.out.println(isPermutationOfPalindrome("Sanketanket"));
	}
}