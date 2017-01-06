public class OverLoadingEx{


	public void fly(int numMiles){ }
	public void fly(short numFeet){ }
	public boolean fly(){ return false; }
	void fly(int numMiles, short numFeet){ }
	public void fly(short numFeet, int numMiles){ }

	public static void main(String[] args){
		System.out.println();
		OverLoadingEx overex = new OverLoadingEx();
		overex.fly();
	}
}

