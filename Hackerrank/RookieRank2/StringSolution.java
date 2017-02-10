// HackerRank in a String!

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here

            if (s.contains("h")){
            	int hindex = s.indexOf("h");
            	String sh = s.substring(hindex+1);
            	if (sh.contains("a")){
	            	int aindex = sh.indexOf("a");
	            	String sha = s.substring(aindex+1);
	            	if (sha.contains("c")){
		            	int cindex = sha.indexOf("c");
		            	String shac = sha.substring(cindex+1);
		            	if (shac.contains("k")){
			            	int kindex = shac.indexOf("k");
			            	String shack = shac.substring(kindex+1);
      						if (shack.contains("e")){
				            	int eindex = shack.indexOf("e");
				            	String shacke = shack.substring(eindex+1);					
				            	if (shacke.contains("r")){
					            	int rindex = shacke.indexOf("r");
					            	String shacker = shacke.substring(rindex+1);
					            	if (shacker.contains("r")){
						            	int r2index = shacker.indexOf("r");
						            	String shackerr = shacker.substring(r2index+1);
						            	if (shackerr.contains("a")){
							            	int a2index = shackerr.indexOf("a");
							            	String shackerra = shackerr.substring(a2index+1);
							            	if (shackerra.contains("n")){
								            	int nindex = shackerra.indexOf("n");
								            	String shackerran = shackerra.substring(nindex+1);
								            	if (shackerran.contains("k")){
									            	int k2index = shackerran.indexOf("k");
									            	String shackerrank = shackerran.substring(k2index+1);
									            	System.out.println("YES");
									            } else { System.out.println("NO");}
									        } else { System.out.println("NO");}
									    } else { System.out.println("NO");}
									} else { System.out.println("NO");}
								} else { System.out.println("NO");}
							} else { System.out.println("NO");}
						} else { System.out.println("NO");}
					} else { System.out.println("NO");}
				} else { System.out.println("NO");}
			} else { System.out.println("NO");}

        }
    }
}
