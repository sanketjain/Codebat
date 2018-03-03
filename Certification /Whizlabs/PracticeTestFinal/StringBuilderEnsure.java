public class StringBuilderEnsure{

	public static void main(String[] args){
		char[] ch = {'1', 'Z', '0', '-', '8', '1'};
		StringBuilder sb = new StringBuilder("ABCDEF");
		sb.delete(4,6);
		System.out.println(sb.capacity());
		sb.ensureCapacity(22);
		System.out.println(sb.capacity());
		sb.ensureCapacity(23);
		System.out.println(sb.capacity());
	}
}