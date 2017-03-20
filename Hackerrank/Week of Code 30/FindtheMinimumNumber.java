import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindtheMinimumNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String firstString = "";
        String lastString = "int"; 
        for(int i=1; i<n; i++){
        	firstString = firstString + "min(int, ";
        	lastString = lastString + ")";
        }
        System.out.println(firstString + lastString);
    }
}
