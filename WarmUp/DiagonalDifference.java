package WarmUp;

import java.io.IOException;

public class DiagonalDifference {

	/*
	 * Complete the diagonalDifference function below.
	 */
	static int diagonalDifference(int[][] a) {
		int firstDiagonal = 0;
		int secondDiagonal = 0;

		int length = a[0].length;
		for (int i = 0; i < length; i++) {
			firstDiagonal += a[i][i];
			secondDiagonal += a[length - i - 1][i];
		}
		int sum = firstDiagonal - secondDiagonal;
		return Math.abs(sum);
	}

	public static void main(String[] args) throws IOException {
		int[][] a = new int[][] { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };
		int result = diagonalDifference(a);
		System.out.println(result);
	}
}
