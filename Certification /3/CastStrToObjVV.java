public class CastStrToObjVV{

	public static void main(String[] args){
		String[] strings = {"stringValue"};
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
//		againStrings[0] = new StringBuilder();
		objects[0] = new StringBuilder();
	}
}