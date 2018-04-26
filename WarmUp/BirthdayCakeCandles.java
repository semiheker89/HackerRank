package WarmUp;

import java.io.IOException;
import java.util.Arrays;

public class BirthdayCakeCandles {

	/*
	 * Complete the birthdayCakeCandles function below.
	 */
	static int birthdayCakeCandles(int n, int[] ar) {
		int count = 0;
		Arrays.sort(ar);
		int max = ar[ar.length - 1];
		for (int a : ar) {
			if (a == max)
				count++;
		}
		return count;

	}

	public static void main(String[] args) throws IOException {

		int[] ar = new int[] { 3, 2, 1, 3 };

		int result = birthdayCakeCandles(4, ar);
		System.out.println(result);
	}
}
