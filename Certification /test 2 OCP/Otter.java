class Toy{
	private boolean countainsIce = false;
	public boolean countainsIce() {
		return countainsIce;
	}
	public void removeIce(){
		this.countainsIce = true;
	}
}


public class Otter{
	private static void play(Toy toy){
		toy.removeIce();
	}

	public static void main(String[] args){
		Toy toy = new Toy();
		Otter.play(toy);
		System.out.println(toy.countainsIce());
		System.out.println();
	}
}
