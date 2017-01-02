public class ForEach2 {
	public static void main(String[] args){
		java.util.List<String> names = new java.util.ArrayList<String>();
		names.add("France");
		names.add("Egypt");
		names.add("Russia");

		for (int i=0; i<names.size(); i++){
			String name = names.get(i);
			if(i>0){
				System.out.print(", ");
			}
			System.out.print(name);
		}
	}
}

