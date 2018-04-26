//package WarmUp;
//
//public class ConnectedCellsInGrid {
//	static int connectedCell(int[][] matrix) {
//		int result = 1;
//		int index = 0;
//		int length = matrix[0].length;
//		Boolean found = Boolean.TRUE;
//		for (int x = 0; x < length; x++) {
//			for (int y = index; y < length; y++) {
//				if (matrix[x][y] == 1 && x < length - 1 && y < length - 1
//						&& (matrix[x][y + 1] == 1 || matrix[x + 1][y] == 1 || (y > 0 && matrix[x + 1][y - 1] == 1)
//								|| matrix[x + 1][y + 1] == 1)) {
//					result++;
//					System.out.println(x + " " + y);
//					index = y;
//				} else {
//					found = Boolean.FALSE;
//				}
//				if (!found)
//					break;
//			}
//		}
//		return result;
//	}
//
//	public static void main(String[] args) {
//		// 1 1 0 0 0
//		// 0 1 1 0 0
//		// 0 0 1 0 1
//		// 1 0 0 0 1
//		// 0 1 0 1 1
//
//		int[][] matrix = new int[][] { { 1, 1, 0, 0, 0 }, { 0, 1, 1, 0, 0 }, { 0, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1 },
//				{ 0, 1, 0, 1, 1 } };
//		int result = connectedCell(matrix);
//		System.out.println(result);
//	}
//}
