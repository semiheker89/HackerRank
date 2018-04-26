package WarmUp;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PlusMinus {

	/*
	 * Complete the plusMinus function below.
	 */
	static void plusMinus(int[] arr) {
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		for (int a : arr) {
			if (a > 0)
				positiveCount++;
			else if (a < 0)
				negativeCount++;
			else
				zeroCount++;
		}
		System.out.println(new BigDecimal(positiveCount).divide(new BigDecimal(arr.length), 6, RoundingMode.HALF_UP));
		System.out.println(new BigDecimal(negativeCount).divide(new BigDecimal(arr.length), 6, RoundingMode.HALF_UP));
		System.out.println(new BigDecimal(zeroCount).divide(new BigDecimal(arr.length), 6, RoundingMode.HALF_UP));

	}

	public static void main(String[] args) {
		int[] arr = new int[] { -4, 3, -9, 0, 4, 1 };

		plusMinus(arr);
	}
}
