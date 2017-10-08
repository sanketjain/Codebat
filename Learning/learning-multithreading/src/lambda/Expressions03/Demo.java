package lambda.Expressions03;

interface Lamda {
	int run();
}

class App {
	void display(Lamda L1) {

		int x = L1.run();
		System.out.println("Running " + x + " Miles");
	}
}

public class Demo {

	public static void main(String[] args) {
		App Ap1 = new App();

		Ap1.display(() -> {
			System.out.println("Testing...");
			return 12;
		});
		// Ap1.display(() -> 12);

	}

}
