package codingexercise;

public class SecondSmallestElement {
	
	static void secondSmallestElement(int[] arr) {
		int first, second, size = arr.length;
		first = second = Integer.MAX_VALUE;
		if(size < 2) {
			System.out.println("Invalid output");
		}
		for(int i =0; i<size; i++) {
		  if(arr[i] < first) {
			  second = first;
			  first = arr[i];			  
		  }
		  else if(arr[i] < second && arr[i] != first) {
			  second = arr[i];
		  }
		}
		System.out.println("second smallest ="+second);
		
	}
	
	public static void main(String args[]) {
		int[] arr = {12, 13, 1, 10, 34, 1};
		secondSmallestElement(arr);
		
	}

}
;