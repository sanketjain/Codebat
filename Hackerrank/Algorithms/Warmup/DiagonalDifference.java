import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
	   	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sumNegDiagonal=0, sumPosDiagonal=0;
        int[][] matriX = new int[n][n];

        for(int i=0; i<n; i++){
        	for(int j=0; j<n; j++){
        		matriX[i][j]= scan.nextInt();
        	}
        	sumNegDiagonal = sumNegDiagonal + matriX[i][i];
        	sumPosDiagonal = sumPosDiagonal + matriX[i][n-i-1];
        }
        
        long diff = sumNegDiagonal-sumPosDiagonal;
        if(diff>0){System.out.println(diff);}
        else {System.out.println(-diff);}
    }
}