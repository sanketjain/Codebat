public class OrderDriver {
	public static void main(String[] args){
		System.out.print(Order.result + " ");
		System.out.println("After line 1");
	
		System.out.print(Order.result + " ");
		System.out.println("After line 2");
	
		new Order();
		System.out.println("After line 3" + Order.result);
	
		new Order();
		System.out.println("After line 4" + Order.result);
	
		System.out.print(Order.result + " ");
		System.out.println("After line 5");
	}
}