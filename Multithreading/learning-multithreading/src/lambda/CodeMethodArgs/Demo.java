package lambda.CodeMethodArgs;

interface Lamda {
	void run(int x);
}

class App {
	void display(Lamda L1) {
		System.out.println("Ready to run");
		L1.run(5);
	}
}

public class Demo {

	public static void main(String[] args) {
		App Ap1 = new App();
		Ap1.display(new Lamda() {

			@Override
			public void run(int x) {
				System.out.println("Running " + x + " Miles");

			}
		});
	}

}
