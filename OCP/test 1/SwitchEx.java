class SwitchEx {
	public static void main(String[] args){
		String year = "Freshman";
		switch(year){
			case "Freshman" : default : case "Sophomore" :
			case "Junior" : System.out.println("See you next year"); break;
			case "Senior" : System.out.println("Congratulations");
		}
	}
}