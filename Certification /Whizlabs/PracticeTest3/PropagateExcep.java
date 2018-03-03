public class PropagateExcep{

	public static void main(String[] args) throws Exception{
	
		try{
			System.out.println("Try Started");
			throw new Exception();
		} catch (Exception e){
			throw e;
		} finally {
			System.out.println("Finally Completed");
		}
	}
}