package examples.searching;

import java.util.HashSet;

public class PairSumEqualToGivenNumber {

	public static void main(String[] args) {
		int[] a = {1,3,4,5,6,8};
		int n = 7;
		getPairSum(a, n);

	}
	
	static void getPairSum(int[] a, int n) {
		int temp;
		HashSet<Integer> set = new HashSet<>();
		for(int i =0; i<a.length; i++) {
			temp = n - a[i];
			if(set.contains(temp)) {
				System.out.println(temp+" "+a[i]);
			}
			set.add(a[i]);
				
		}
	}

}
