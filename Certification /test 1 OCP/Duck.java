interface Waterfowl{}

class Bird{}

public class Duck extends Bird implements Waterfowl {
	public void quack(){System.out.println("quack!");}
	public static void main(String[] args){
		Object object = (Object)new Bird();
		Duck duck = (Duck)object;
		duck.quack();
	}
}

