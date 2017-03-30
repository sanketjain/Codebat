import java.io.*;
import java.util.*;

public class TowerBreakers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0; i<t; i++){
            int n = scan.nextInt();
            int m = scan.nextInt();
            if(n%2!=0){
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
    }
}