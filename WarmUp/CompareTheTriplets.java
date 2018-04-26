package WarmUp;

import java.io.IOException;

public class CompareTheTriplets {

	/*
	 * Complete the solve function below.
	 */
	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		int[] result = new int[2];
		int[] inputs = new int[] { a0, a1, a2, b0, b1, b2 };
		for (int i = 0; i < 3; i++) {
			if (inputs[i] > inputs[i + 3]) {
				result[0]++;
			} else if (inputs[i] < inputs[i + 3]) {
				result[1]++;
			}
		}
		return result;

	}

	public static void main(String[] args) throws IOException {

		int a0 = 5, a1 = 6, a2 = 7, b0 = 3, b1 = 6, b2 = 10;

		int[] result = solve(a0, a1, a2, b0, b1, b2);

		for (int number : result) {
			System.out.println(number);
		}
	}
}
