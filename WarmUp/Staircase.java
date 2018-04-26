package WarmUp;

public class Staircase {

	/*
	 * Complete the staircase function below.
	 */
	static void staircase(int n) {
		/*
		 * Write your code here.
		 */
		for (int i = 0; i < n; i++) {
			for (int y = 0; y < n; y++) {
				if (y > n - i - 2) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		staircase(6);
	}
}
