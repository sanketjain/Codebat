public class ReplaceSpaces{
	public static void main(String[] args){
		String s1 = ReplaceSpaces.replaceAllSpacesMe("Sanket Jain  ", 11);
		System.out.println(s1);
		char[] ch = {'S','a','n','k','e','t',' ','J','a','i','n',' ',' '};
		ReplaceSpaces.replaceAllSpacesCTCI(ch, 11);
	}
	
	public static String replaceAllSpacesMe(String givenString, int trueLength){
		int totalLength = givenString.length();
		char[] givenCharacterArray = givenString.toCharArray();
		char[] toReturnArray = new char[totalLength];

		int i = totalLength - 1;
		while(givenCharacterArray[i] == ' '){
			i--;
		}

		int lastSpaceCount = i;

		for(int x=totalLength-1; x>=0; ){
			if(givenCharacterArray[i] != ' '){
				toReturnArray[x] = givenCharacterArray[i];
				x--; 
				i--;
			} else {
				toReturnArray[x] = '0';
				toReturnArray[x-1] = '2';
				toReturnArray[x-2] = '%';
				x = x-3;
				i--;
			}
		}
		return new String(toReturnArray);
	}

	public static void replaceAllSpacesCTCI(char[] str, int trueLength){
		int spaceCount = 0, index, i=0;
		for(i=0; i<trueLength; i++){
			if(str[i] == ' '){
				spaceCount++;
			}
		}

		index = trueLength + spaceCount * 2;
		if(trueLength < str.length){
			str[trueLength] = '\0';
		}
		for(i = trueLength-1; i>=0; i--){
			if(str[i]==' '){
				str[index-1] = '0';
				str[index-2] = '2';
				str[index-3] = '%';
				index  = index - 3;
			} else {
				str[index-1] = str[i];
				index--;
			}
		}

		System.out.println(new String(str));
	}

}