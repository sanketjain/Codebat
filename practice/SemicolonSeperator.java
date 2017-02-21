import java.util.*;
import java.io.File;


public class SemicolonSeperator{
	public static void main(String[] args) throws Exception{
		String inputStr = new Scanner(new File("/Users/sanketjain/Documents/Java-Codes/practice/file2.txt")).useDelimiter("\\Z").next();
	//	System.out.println(inputStr);
		String emailIDs = inputStr;

		String email1 = "";
		int indexOfSemicolon = 0;
		int param = emailIDs.length();
		int lenghtOfemail1 = 0;
		String companywithDotCom;
		String companyName;
		int indexOfattheRate;
		int indexOfDot;
	//	System.out.println(param);

		do {
			if(inputStr.contains(";")){
				indexOfSemicolon = emailIDs.indexOf(";");
				email1 = emailIDs.substring(0, (indexOfSemicolon+1));
				System.out.println(email1);

				indexOfattheRate = email1.indexOf("@");
				companywithDotCom = email1.substring(indexOfattheRate+1);
				System.out.println(companywithDotCom);

				indexOfDot = companywithDotCom.indexOf(".");
				companyName = companywithDotCom.substring(0, indexOfDot);
				System.out.println(companyName);


				emailIDs = emailIDs.substring((indexOfSemicolon+1), emailIDs.length()).trim();
				param = param - 11;
				}
		} while(param>5);

	}
}
