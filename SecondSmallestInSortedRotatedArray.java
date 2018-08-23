package codingexercise;

public class SecondSmallestInSortedRotatedArray {

	static int secondSmallestSortedRotatedArray(int arr[], int low, int high) {
		if(low > high) {
			System.out.println(arr[1]);
			return 0;
		}
		int mid = low + (high - low)/2;
		if(mid < high && arr[mid] > arr[mid+1]) {
			System.out.println(arr[mid]);
			return 0;
		}
		if(mid > low && arr[mid] < arr[mid-1]) {
			System.out.println(arr[mid+1]);
			return 0;
		}
		if(arr[high] > arr[mid]) 
			secondSmallestSortedRotatedArray(arr, low, mid-1);
		else
			secondSmallestSortedRotatedArray(arr, mid+1, high);
		return 0;
	}
	public static void main(String[] args) {
		int arr1[] = {5,6,1,2,3,4};
		int n1 = arr1.length;
		secondSmallestSortedRotatedArray(arr1, 0, n1-1);
		int arr2[] = {1, 2, 3, 4};
		int n2 = arr2.length;
		secondSmallestSortedRotatedArray(arr2, 0, n2-1);
		int arr3[] = {1, 2};
		int n3 = arr3.length;
		secondSmallestSortedRotatedArray(arr3, 0, n3-1);
	}

}
