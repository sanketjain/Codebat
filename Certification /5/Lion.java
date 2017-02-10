public class Lion extends Animal{
	private void roar(){
		System.out.println("The " + getAge() + " year old Lion Roars!");
	}

	public static void main(String[] args){
		Lion lion = new Lion();
		lion.roar();
	}
}

