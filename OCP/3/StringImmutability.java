//Error: This one does not work

class StringImmutability {

	class Mutable{
		private String s;
		public void setS(String newS){s = newS;}
		public String getS() {return s;}

		Mutable mutable = new Mutable();
		mutable.setS("Sanket");
		System.out.println(mutable.getS());
	}

	final class Immutable {
		private String s = "name";
		public String getS() {return s;}
	}
	
	public static void main(String[] args){
		System.out.println();
	}	
}

