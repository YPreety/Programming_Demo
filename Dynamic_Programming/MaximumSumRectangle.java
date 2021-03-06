package Dynamic_Programming;

/*Kadane�s algorithm 
Given a 2D array, find the maximum sum subarray in it. For example, in the following 2D array, the maximum sum subarray is highlighted with blue 
rectangle and sum of this subarray is 29.
time complexity to O(n^3)
MaxSum: 29, range: [(1, 1)(3, 3)]
*/

public class MaximumSumRectangle {

	public static void main(String[] args) throws java.lang.Exception {
		findMaxSubMatrix(
				new int[][] { { 1, 2, -1, -4, -20 }, { -8, -3, 4, 2, 1 }, { 3, 8, 10, 1, 3 }, { -4, -1, 1, 7, -6 } });
	}

	public static void findMaxSubMatrix(int[][] a) {
		int cols = a[0].length;
		int rows = a.length;
		int[] currentResult;
		int maxSum = Integer.MIN_VALUE;
		int left = 0;
		int top = 0;
		int right = 0;
		int bottom = 0;

		for (int leftCol = 0; leftCol < cols; leftCol++) {
			int[] tmp = new int[rows];
			for (int rightCol = leftCol; rightCol < cols; rightCol++) {
				for (int i = 0; i < rows; i++) {
					tmp[i] += a[i][rightCol];
				}
				currentResult = kadane(tmp);
				if (currentResult[0] > maxSum) {
					maxSum = currentResult[0];
					left = leftCol;
					top = currentResult[1];
					right = rightCol;
					bottom = currentResult[2];
				}
			}
		}
		System.out.println("MaxSum: " + maxSum + ", range: [(left " + left + ", top " + top + ")( right " + right + ", bottom " + bottom + ")]");
	}

	public static int[] kadane(int[] a) {
		int[] result = new int[] { Integer.MIN_VALUE, 0, -1 };
		int currentSum = 0;
		int localStart = 0;
		for (int i = 0; i < a.length; i++) {
			currentSum += a[i];
			if (currentSum < 0) {
				currentSum = 0;
				localStart = i + 1;
			} else if (currentSum > result[0]) {
				result[0] = currentSum;
				result[1] = localStart;
				result[2] = i;
			}
		}
		if (result[2] == -1) {
			result[0] = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] > result[0]) {
					result[0] = a[i];
					result[1] = i;
					result[2] = i;
				}
			}
		}

		return result;
	}
}
