package WarmUp;

import java.io.IOException;

public class VeryBigSum {

	/*
	 * Complete the aVeryBigSum function below.
	 */
	static long aVeryBigSum(int n, long[] ar) {
		long sum = 0;

		for (int i = 0; i < n; i++) {
			sum += ar[i];
		}

		return sum;

	}

	public static void main(String[] args) throws IOException {

		long[] ar = new long[] { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005 };

		long result = aVeryBigSum(5, ar);
		System.out.println(result);

	}
}
