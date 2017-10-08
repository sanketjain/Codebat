package gs.wildcard2;

import java.util.ArrayList;

class Vehicle {

	@Override
	public String toString() {
		return "Vehicle []";
	}

	public void runs() {
		System.out.println("Running Vehicle");
	}

	public void vehicleMsg() {
		System.out.println("Inside Vehicle");
	}

}

class Car extends Vehicle {

	@Override
	public String toString() {
		return "Car []";
	}

	@Override
	public void runs() {
		System.out.println("Running Car");
	}

	public void carMsg() {
		System.out.println("Inside Car");
	}
}

public class Demo {

	public static void main(String[] args) {
		ArrayList<Vehicle> list1 = new ArrayList<Vehicle>();
		list1.add(new Vehicle());
		display3(list1);

		ArrayList<Car> list2 = new ArrayList<Car>();
		list2.add(new Car());
		display3(list2);
	}

	// public static void display1(ArrayList<?> demoList) {
	// for (Object value : demoList) {
	// System.out.println(value);
	// }
	// }

	// public static void display2(ArrayList<? extends Vehicle> demoList) {
	// for (Vehicle value : demoList) {
	// value.runs();
	// value.vehicleMsg();
	// //System.out.println(value);
	// }
	// }
	
	public static void display3(ArrayList<? super Car> demoList){
		for (Object value : demoList) {
			System.out.println(value);
		}	
	}

}
