import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class checkWeird {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String w = " ";

        if((n%2) != 0){
            w = "Weird";
        } else if (n==2 || n==4){
            w = "Not Weird";
        } else if(((n%2)==0) && (n>=6) && (n<=20)){
            w = "Weird";
        } else if (n>20){
            w = "Not Weird";
        } else {
            w = "Not Weird";
        }
        System.out.println(w);   
    }
}