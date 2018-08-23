package codingexercise;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
       int arr[] = { 1, 34, 3, 98, 9, 76, 45, 4,8 };
		//998764543431

		String largestNum = largestNumber(arr);

		System.out.println(largestNum);

    }
	
	public static String largestNumber(int[] num) {
		String[] array = new String[num.length];
		for(int i =0; i < num.length; i++) {
			array[i] = String.valueOf(num[i]);
		}
		Arrays.sort(array, new Comparator<String>() {
			public int compare(String a, String b) {
				return (b+a).compareTo(a+b);
			}
		});
		StringBuilder sb = new StringBuilder();
		for(String str: array) {
			sb.append(str);
		}
		return sb.toString();
	}

}
