import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grade {

    static int[] solve(int[] grades){
        // Complete this function
        int[] ola = grades;
        int nextFive = 0;
        for(int j=0; j<grades.length; j++){
            if(grades[j]<38){
                ola[j] = grades[j];
            } else {
                nextFive = ((grades[j] / 5) + 1) * 5;
                if((nextFive - grades[j]) < 3){
                    ola[j] = nextFive;
                } else {
                    ola[j] = grades[j];
                }
            }
        }
        return ola;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
