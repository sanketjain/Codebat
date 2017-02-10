public class TryCatchExcep {

	void explore(){
			try {
				fall();
				System.out.println("never get here");
			} catch (RuntimeException e){
	//			getUp();
				System.out.println("get up");
			} 
	//		seeAnimals();
		}


	void fall() { 
		throw new RuntimeException(); 
	}


	public static void main(String[] args){
		TryCatchExcep tc = new TryCatchExcep();
//		tc.fall();
		tc.explore();
	}


}

