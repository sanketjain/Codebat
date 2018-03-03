public class StringBuilderAppend{

	public static void main(String[] args){
		char[] ch = {'1', 'Z', '0', '-', '8', '1'};
		StringBuilder sb = new StringBuilder();
		sb.append(ch, 0, ch.length-1);
		sb.append('0');
		sb.append("8");
		System.out.print(sb);
	}
}