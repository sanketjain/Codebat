public class FindFullName{
	public static void main(String[] args){
		String currentLine = "INSERT INTO AMAZON.CUSTOMER AS SELECT * FROM AMAZON.PRODUCT";
		String table = "CUSTOMER";
		String fullName = table;

		//Code to find the full name, given the query and tablename
		int indexOfTableString = currentLine.indexOf(table);
//		System.out.println(indexOfTableString);
		String subquery = currentLine.substring(0, indexOfTableString);
//		System.out.println(subquery);
		int indexofSpace;
		String reverseSubquery = new StringBuilder(subquery).reverse().toString();
//		System.out.println(reverseSubquery);
		if(reverseSubquery.contains(" ")){
			indexofSpace = reverseSubquery.indexOf(" ");
//			System.out.println(indexofSpace);

			String reverseHalfName = reverseSubquery.substring(0, indexofSpace);
			System.out.println(reverseHalfName);
			String halfName = new StringBuilder(reverseHalfName).reverse().toString();
			System.out.println(halfName);
			String fullName = halfName + table;
			System.out.println(fullName);
		}


	}
}