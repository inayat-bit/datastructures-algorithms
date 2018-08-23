package codingexercise;

public class MinimumSubArrayExceedingSum {
	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 5, 7, 8, 40, 34, 56, 20, 1, 3, 1, 1, 1, 1, 1, 1, 1 };

		System.out.println("minlength:" + smallestSubArray(arr, 114));

	}



	private static int smallestSubArray(int[] arr, int x) {

		int start = 0, end = 0;

		int cursum = 0, minlength = arr.length+1;

		int startIndex = 0;

		while (end < arr.length) {			

			while (cursum <= x && end < arr.length) {

				cursum += arr[end++];

			}

			

			while (cursum >= x && start < arr.length) {

				cursum -= arr[start++];

				if (end - start < minlength && cursum >= x ) {

					minlength = end - start;

					startIndex = start;

				}
			}

		}

		//System.out.println(startIndex);

		

		/*for (int i = 0; i < minlength; i++) {

			System.out.print(arr[startIndex + i] + ",");

		}*/

		return minlength;

	}
}
