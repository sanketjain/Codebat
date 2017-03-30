import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MelodiousPassword {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		String[] consoNents = new String[]{ "b", "c", "d", "f", "g", "h", 
	    "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
	    String[] voWels = new String[] {"a", "e", "i", "o", "u"};

        switch(n){
        	case 1:
        		for(String c1: consoNents){
        			System.out.println(c1);
        		}
        		for (String v1: voWels){
        			System.out.println(v1);
        		}
        	break;
        	case 2:
	        	for(String c2: consoNents){
		        	for (String v1: voWels){
		       			System.out.println(c2+ v1);
	    	   		}
	        	}
	        	for (String v2: voWels){
	        		for(String c1: consoNents){
        				System.out.println(v2 + c1);
        			}
	       		}
	       	break;

        	case 3:
        	    for(String c3: consoNents){
        	    	for (String v2: voWels){
	        			for(String c1: consoNents){
        					System.out.println(c3 + v2 + c1);
        				}
	       			}
        		}
        		for (String v3: voWels){
        			for(String c2: consoNents){
		        		for (String v1: voWels){
		       				System.out.println(v3 + c2 + v1);
	    	   			}
	        		}
        		}
        	break;

        	case 4:
	        	for(String c4: consoNents){
	        		for (String v3: voWels){
        				for(String c2: consoNents){
		        			for (String v1: voWels){
		       					System.out.println(c4 + v3 + c2 + v1);
	    	   				}
	        			}
        			}
        		}
        		for (String v4: voWels){
        			for(String c3: consoNents){
        	    		for (String v2: voWels){
	        				for(String c1: consoNents){
        						System.out.println(v4 + c3 + v2 + c1);
        					}
	       				}
        			}
        		}
        	break;

        	case 5:
	        	for(String c5: consoNents){
	        		for (String v4: voWels){
	        			for(String c3: consoNents){
	        	    		for (String v2: voWels){
		        				for(String c1: consoNents){
	        						System.out.println(c5 + v4 + c3 + v2 + c1);
	        					}
		       				}
	        			}
        			}
        		}
        		for (String v5: voWels){
	        		for(String c4: consoNents){
		        		for (String v3: voWels){
	        				for(String c2: consoNents){
			        			for (String v1: voWels){
			       					System.out.println(v5 + c4 + v3 + c2 + v1);
		    	   				}
		        			}
	        			}
	        		}
        		}
        	break;

        	case 6:
        		for(String c6: consoNents){
        			for (String v5: voWels){
		        		for(String c4: consoNents){
			        		for (String v3: voWels){
		        				for(String c2: consoNents){
				        			for (String v1: voWels){
				       					System.out.println(c6 + v5 + c4 + v3 + c2 + v1);
			    	   				}
			        			}
		        			}
		        		}
        			}
        		}


        		for (String v6: voWels){
        			for(String c5: consoNents){
		        		for (String v4: voWels){
		        			for(String c3: consoNents){
		        	    		for (String v2: voWels){
			        				for(String c1: consoNents){
		        						System.out.println(v6 + c5 + v4 + c3 + v2 + c1);
		        					}
			       				}
		        			}
	        			}
        			}
        		}
        	break;
        	
        }
    }
}