public class MultipleCatch{

	public static void main(String[] args) throws Exception{
	
		try{
			int i = Integer.parseInt(args[0]);
			System.out.println(i);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bounds Exception");
		} catch(NumberFormatException e) {
			System.out.println("Number Format Exception");
		}
		
	}
}