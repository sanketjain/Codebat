public class TryCatchExcep2 {

	void explore(){
			try {
				fall();
				System.out.println("never get here");
			} catch (RuntimeException e){
	//			getUp();
	//			getHugFromDaddy();
				System.out.println("got hug");
			} finally {
	//		seeMoreAnimals();
				System.out.println("See more animals");				
			}
	//		goHome();
		}

	void fall() { 
		throw new RuntimeException(); 
	}

	public static void main(String[] args){
		TryCatchExcep2 tc = new TryCatchExcep2();
//		tc.fall();
		tc.explore();
	}

}

