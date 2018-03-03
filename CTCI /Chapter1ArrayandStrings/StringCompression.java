public class StringCompression{
	public static void main(String[] args){
		String string = StringCompression.SlowNSquaredCompression("sssaa");
		System.out.println(string);

		String stringB = StringCompression.BetterRuntime("sssaa");
		System.out.println(stringB);

	}

	static String SlowNSquaredCompression(String givenString){
		String compresssedString = "";
		int countConsecutive = 0;
		for(int index=0; index<givenString.length(); index++){
			countConsecutive++;

			if(index + 1 >= givenString.length() || 
				givenString.charAt(index) != givenString.charAt(index + 1)){
				compresssedString += "" + givenString.charAt(index) + countConsecutive;
				countConsecutive=0;
			}
		}
		return compresssedString.length() < givenString.length() ?
			compresssedString : givenString;
	}


	static String BetterRuntime(String givenString){
		StringBuilder compresssedSB = new StringBuilder();
		int countConsecutive = 0;
		for(int index=0; index<givenString.length(); index++){
			countConsecutive++;

			if(index + 1 >= givenString.length() || 
				givenString.charAt(index) != givenString.charAt(index + 1)){
				compresssedSB.append(givenString.charAt(index));
				compresssedSB.append(countConsecutive);
				countConsecutive=0;
			}
		}
		return compresssedSB.length() < givenString.length() ?
			compresssedSB.toString() : givenString;
	}

}