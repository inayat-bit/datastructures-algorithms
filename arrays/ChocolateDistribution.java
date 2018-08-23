package examples.arrays;

import java.util.Arrays;

public class ChocolateDistribution {

	public static void main(String[] args) {
	  int[] arr = {12, 4, 7, 9, 2, 23, 25, 41,
              30, 40, 28, 42, 30, 44, 48, 
              43, 50};
	  int[] arr1 = {3, 4, 1, 9, 56, 7, 9, 12};
	  System.out.println(findMinDiff(arr1, 5));

	}
	
	static int findMinDiff(int[] arr, int m) {
		int n = arr.length;
		if(m > n)
		  return -1;
		int minDiff = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int i = 0; i+m-1 < n; i++) {
			int diff = arr[m+i-1] - arr[i];
			if(minDiff > diff) {
				minDiff = diff;
			}
		}
		return minDiff;
	}

}
