
class AnimalsOutForAWalk extends RuntimeException { }
class ExhibitClosed extends RuntimeException { }
class ExhibitClosedForLunch extends ExhibitClosed { }

public class TypesofExcep {

	public void visitPorcupine() {
		try {
//			seeAnimal();
		} catch (AnimalsOutForAWalk e) {
			System.out.println("try back later");
		} catch (ExhibitClosed e) {
			System.out.println("not today");
		}
	}

	public static void main(String[] args){
		TypesofExcep toe = new TypesofExcep();
		toe.visitPorcupine();
//		System.out.println();
	}
}

