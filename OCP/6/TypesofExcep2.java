
//class AnimalsOutForAWalk extends RuntimeException { }
//class ExhibitClosed extends RuntimeException { }
//class ExhibitClosedForLunch extends ExhibitClosed { }

public class TypesofExcep2 {

	public void visitMonkeys() {
		try {
//			seeAnimal();
		} catch (ExhibitClosedForLunch e) {
			System.out.println("try back later");
		} catch (ExhibitClosed e) {
			System.out.println("not today");
		}
	}

	public static void main(String[] args){
		TypesofExcep2 toe2 = new TypesofExcep2();
		toe2.visitMonkeys();
//		System.out.println();
	}
}

