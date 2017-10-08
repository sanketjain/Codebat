package algo.binarysearch;

import java.util.ArrayList;
import java.util.Collections;

public class AlphaNumber {

	public static void main(String[] args) {
		String str = "AZQF013452BAB";

		System.out.println(sortSegments(str));
	}

	public static String sortSegments(String str) {
		String finalString = "";
		ArrayList intArr = new ArrayList();
		ArrayList strArr = new ArrayList();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int k = Character.getNumericValue(ch);
			// System.out.println("Value of k is: " + k + " and of i is " + i);

			if (k >= 0 && k <= 9) {
				Collections.sort(strArr);
				if (!strArr.isEmpty()) {
//					System.out.println("Adding strArr to finalString");
					finalString = finalString + strArr.toString();
				}
	//			System.out.println("finalString is " + finalString); // debug
				strArr.clear();
				intArr.add(ch); // Add integers to intArr
		//		System.out.println("iiiiiiiiiiiiii Value of intArr is: " + intArr);
			} else {
				// Sort intArr
				Collections.sort(intArr);
				if (!intArr.isEmpty()) {
					finalString = finalString + intArr.toString();
				}
			//	System.out.println("finalString is " + finalString); // debug
				intArr.clear(); // finally clear the intArr
				strArr.add(ch);
				//System.out.println("sssssssssssss Value of strArr is: " + strArr);
			}
		}

		Collections.sort(strArr);
		Collections.sort(intArr);
		if (!intArr.isEmpty()) {
			finalString = finalString + intArr.toString();
		}
		if (!strArr.isEmpty()) {
//			System.out.println("Adding strArr to finalString");
			finalString = finalString + strArr.toString();
		}
	//	System.out.println("finalString is " + finalString); // debug

		String toReturn = "";
		for (int m = 0; m < finalString.length(); m++) {
			if ((finalString.charAt(m) == 91) || (finalString.charAt(m) == 93) || (finalString.charAt(m) == 32)
					|| (finalString.charAt(m) == 44)) {
			} else {
				toReturn = toReturn + finalString.charAt(m);
			}
		}

		return toReturn;
	}

}
