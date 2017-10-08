package lambda.Expressions01;

interface Lamda {
	void run();
}

class App {
	void display(Lamda L1) {
		System.out.println("Ready to run");
		L1.run();
	}
}

public class Demo {

	public static void main(String[] args) {
		App Ap1 = new App();

		Ap1.display(()->{
			System.out.println("Running");
			System.out.println("Running fast");
		});
		
		// Ap1.display(() -> System.out.println("Running "));

		// Ap1.display(new Lamda() {
		//
		// @Override
		// public void run() {
		// System.out.println("Running ");
		// }
		// });
	}

}
