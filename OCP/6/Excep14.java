import java.io.*;

public class Excep14 {

	public void ohNo() throws IOException {
		System.out.println("it's ok");
//		throw new Exception();
//		throw new IllegalArgumentException();
//		throw new java.io.IOException();
//		throw new RuntimeException();

	}

	public static void main(String[] args){
		Excep14 obj1 = new Excep14();
		obj1.ohNo();
	}
}

