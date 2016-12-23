public class KoalaTester{
	public static void main(String[] args){
		Koala.main(new String[0]); //call static method
		Koala k = new Koala();
		System.out.println("testing k value " + k.count);
		k = null;
		System.out.println("retesting k value " + k.count);
//		System.out.println("Koala count " + Koala.count);
		

		Koala.count = 4;
		Koala koala1 = new Koala();
		Koala koala2 = new Koala();
		Koala.count = 6;
		Koala.count = 5;
		System.out.println("Koala count " + Koala.count);

	}
}
