
//class AnimalsOutForAWalk extends RuntimeException { }
//class ExhibitClosed extends RuntimeException { }
//class ExhibitClosedForLunch extends ExhibitClosed { }

public class TypesofExcep3 {

	public void visitMonkeys2() {
		try {
//			seeAnimal();
		} catch (ExhibitClosed e) { //Does not compile cuz it is superclass 
			System.out.println("not today");
		} catch (ExhibitClosedForLunch e) {
			System.out.println("try back later");
		} 
	}

	public static void main(String[] args){
		TypesofExcep3 toe2 = new TypesofExcep3();
		toe2.visitMonkeys2();
//		System.out.println();
	}
}

