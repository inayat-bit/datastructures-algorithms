package examples.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
	    int arr2[] = new int[]{2, 3, 8, 13};
	    System.out.print("After Merging Array: ");
        merge(arr1, arr2, arr1.length,arr2.length);
    }
	
	static void merge(int[] arr1, int[] arr2, int n1, int n2) {
		int[] arr3 = new int[n1+n2];
		int k = 0, i= 0, j = 0;
		while(i < n1 && j < n2) {
			if(arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			}
		}
		
		while (i < n1) {
			arr3[k++] = arr1[i++];
		}
		
		while (j < n2) {
			arr3[k++] = arr1[j++];
		}
		System.out.println(Arrays.toString(arr3));
	}
	

}
