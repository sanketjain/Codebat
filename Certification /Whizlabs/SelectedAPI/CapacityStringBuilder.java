public class CapacityStringBuilder{
	
	public static void main(String[] args){
		StringBuilder sb1 = new StringBuilder(10);
		StringBuilder sb2 = new StringBuilder("ABCD");
		System.out.println(sb1.capacity() + sb2.capacity());
	}

}