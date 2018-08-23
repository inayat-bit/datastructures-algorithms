package codingexercise;

import java.util.HashMap;

public class PairCountForGivenSum {

	public static void main(String[] args) {
		int[] input = {-2,8,5,3,-4,-14,-9};
	    int sum = -6;
	    int countOfPairs  = getCountOfPairsForTheGivenSum(input,sum);
	    System.out.println("Pair count:"+countOfPairs);
	}
	
	static int getCountOfPairsForTheGivenSum(int[] input, int sum) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int count =0;
		for(int i =0; i<input.length; i++) {
			int key = input[i];
			if(!hm.containsKey(key)) {
				hm.put(key, 1);
			} else {
				hm.put(key, hm.get(key)+1);
			}
		}
		for(int i =0; i<input.length; i++) {
			int remainingSum = sum - input[i];
			if(hm.containsKey(remainingSum)) {
				count = count + hm.get(remainingSum);
			}
		}
		return count/2;
	}

}
