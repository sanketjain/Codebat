public class Counter{

	private static int count;
	public Counter() { count++ ;}
	
//	private static final ArrayList<String> values = new ArrayList<>();

	public static void main(String[] args){
		Counter c1 = new Counter();		
		Counter c2 = new Counter();		
		Counter c3 = new Counter();		
		System.out.println(count);
		System.out.println(c1.count);
		System.out.println(Counter.count);
//		values.add("changed");
	}
}
