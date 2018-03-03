public class PrivateInsideSwitch{


	public static void main(String[] args){
		final int s= 2;
		private final int x = 3;

		switch(s){
			case 1: ;
			case x-1: ;
			case x: ;
			case x+1: ;
		}

	}
}