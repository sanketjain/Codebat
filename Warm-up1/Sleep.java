public class Sleep{
	public static void main(String[] args){
		Sleep a = new Sleep();
		System.out.println(a.sleepIn(false, false));
		System.out.println(a.sleepIn(true, false));
		System.out.println(a.sleepIn(false, true));
	}	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if(weekday==false || vacation==true){
	    	return true;
  		}else {
    		return false;
  		}
	}
}