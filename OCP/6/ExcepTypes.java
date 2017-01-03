public class ExcepTypes{
	public static void main(String[] args){
//		int answer = 11/0; //Airthmetic - divide by zero
 
 		int[] countsOfMoose = new int[3];
// 		System.out.println(countsOfMoose[-1]); //ArrayIndexOutofBound

 		String type = "moose";
// 		Integer num = (Integer) type; //Does not Compile
 		Object obj = type;
// 		Integer num2 = (Integer) obj; //ClassCast

//Illegal argument - used when we do not want to accept certain datatype/values.

 		String name;
 		// public void printLength() throws NullPointerException {
			// System.out.println(name.length());
 		// } //NullPointer

// 		Integer.parseInt("abc"); //NumberFormat
		System.out.println();
	}
}

