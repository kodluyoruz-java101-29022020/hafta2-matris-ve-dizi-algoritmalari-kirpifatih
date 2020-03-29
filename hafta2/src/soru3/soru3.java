package soru3;

public class soru3 {

	public static void main(String[] args) {
		
		Matrix matrix = new Matrix();

		int[][] firstMatrix = matrix.fillMatrix(2, 2);

		int[][] secondMatrix = matrix.fillMatrix(2, 3);
		int[][] result;

		matrix.printMatrix(firstMatrix);

		System.out.println("---------------------------------\n");
		matrix.printMatrix(secondMatrix);

		System.out.print("---------------------------------\n");

		result = matrix.multiplyMatrix(firstMatrix, secondMatrix);
		matrix.printMatrix(result);

	
	}

}
