 package lambda.Expressions02;

interface Lamda {
	void run(int x, int y);
}

class App {
	void display(Lamda L1) {
		System.out.println("Ready to run");
		L1.run(5, 4);
	}
}

public class Demo {

	public static void main(String[] args) {
		App Ap1 = new App();

		Ap1.display((int x, int y) -> {
			System.out.println("Running " + (x + y) + " Miles");
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
