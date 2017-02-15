import java.util.ArrayList;


public class Bcontainsfrom{
	public static void main(String[] args){
		String thisLine = "ad adfa VIEW   we rt x tw  qw tw";
		int indexofview = thisLine.indexOf("VIEW");
        System.out.println(indexofview);  

    	String firstSubString = thisLine.substring(indexofview+4);
    	int indexofspace = firstSubString.indexOf(" ");
    	 	
    	
    	int indextill = firstSubString.indexOf(" ") + indexfrom;
		System.out.println(indextill);
//       	int indextillsample = 16;
    	String leftoverToAdd = thisLine.substring(indexfrom, indextill);
    	viewList.add(leftoverToAdd);

		
	}
}
