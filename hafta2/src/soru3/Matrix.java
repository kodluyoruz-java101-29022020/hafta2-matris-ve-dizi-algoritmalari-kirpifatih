package soru3;

public class Matrix {
	public int[][] fillMatrix(int rowCount, int columnCount) {

		int[][] matrix = new int[rowCount][columnCount];

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				int matrixValue = (int) (Math.random() * (10 - 0));
				matrix[i][j] = matrixValue;
			}
		}

		return matrix;

	}

	public void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				System.out.print(matrix[i][j] + " ");
			}

			System.out.print("\n");
		}
	}

	public int[][] multiplyMatrix(int[][] firstMatrix, int[][] secondMatrix) {

		int[][] resultMatrix = new int[firstMatrix.length][secondMatrix[0].length];

		for (int i = 0; i < resultMatrix.length; i++) {

			for (int j = 0; j < resultMatrix[0].length; j++) {

				int result = 0;
				for (int k = 0; k < secondMatrix.length; k++) {
					result += firstMatrix[i][k] * secondMatrix[k][j];
				}
				resultMatrix[i][j] = result;
			}

		}

		return resultMatrix;
	}
}
