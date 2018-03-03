public class PalindromePermutation{
	public static void main(String[] args){
		System.out.println(PalindromePermutation.isPalindrome("SannaS"));
		System.out.println(PalindromePermutation.isPalindrome("San1naS"));
		System.out.println(PalindromePermutation.isPalindrome("San12naS"));
	}

	public static boolean isPalindrome(String str){
		char[] givenStr = str.toCharArray();
		boolean[] isOdd = new boolean[128];

		for(char c : givenStr){
			if(isOdd[c]){
				isOdd[c] = false;
			} else {
				isOdd[c] = true;
			}
		}

		int count = 0;
		for(boolean bool : isOdd){
			if(bool){
				count++;
			} 
		}

		if(count>1){
			return false;
		}

		return true;
	}
}