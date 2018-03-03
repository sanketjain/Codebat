import java.util.Arrays;

public class ZeroMatrix{
	public static void main(String[] args){
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 0, 9}};
		ZeroMatrix.setZeros(matrix);
		System.out.println(Arrays.deepToString(matrix));
}

	static void setZeros(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		for(int indexX=0; indexX<matrix.length; indexX++){
			for(int indexY=0; indexY<matrix[0].length; indexY++){
				if(matrix[indexX][indexY] == 0){
					row[indexX] = true;
					column[indexY] = true;
				}
			}
		}

		for(int indexX=0; indexX<row.length; indexX++){
			if(row[indexX]){
				nullifyRow(matrix, indexX);
			}
		}

		for(int indexY=0; indexY<column.length; indexY++){
			if(column[indexY]){
				nullifyColumn(matrix, indexY);
			}
		}
	}

	static void nullifyRow(int[][] matrix, int row){
		for(int indexY=0; indexY<matrix[0].length; indexY++){
			matrix[row][indexY]=0;
		}
	}

	static void nullifyColumn(int[][] matrix, int column){
		for(int indexX=0; indexX<matrix.length; indexX++){
			matrix[indexX][column]=0;
		}
	}

}