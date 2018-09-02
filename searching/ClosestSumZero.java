package examples.searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestSumZero {

	public static void main(String[] args) {
	  //int a[] = {1,60,-10,70,-80,85};
	  int a[] = {-80, -10, 1, 60, 70, 85};
	  closestSum(a);
	}
	static void closestSum(int a[]) {
		int postiveSum = Integer.MAX_VALUE, negativeSum = Integer.MIN_VALUE;
		int i =0, j = a.length-1, temp;
		int leftIndex, rightIndex;
		while(i<j) {
			temp = a[i]+a[j];
			if(temp > 0) {
				if(temp < postiveSum)
					postiveSum = temp;
				j--;
			}
			else if(temp < 0) {
				if(temp > negativeSum) {
					negativeSum = temp;
				}
				i++;
			}
			else {
				System.out.println("Closest Sum ="+a[i]+" "+a[j]);
			}
		}
		temp = postiveSum < Math.abs(negativeSum) ? postiveSum : negativeSum;
		System.out.println(temp);
		
	}

}
