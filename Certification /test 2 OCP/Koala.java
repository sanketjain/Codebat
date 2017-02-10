public class Koala implements CanClimb, HasClaws {
	public boolean isSharp() {return true;}
	public int maxHeight() {return 15;}
	public static void main(String[] args){
		Object koala = new Koala();
		CanClimb canClimb = (CanClimb)koala;
		System.out.println(canClimb);
		HasClaws hasClaws = (HasClaws)canClimb;
		System.out.println(hasClaws);
		System.out.print(canClimb.maxHeight());
		System.out.print(hasClaws.isSharp());
	}
}
