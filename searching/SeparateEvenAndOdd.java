package examples.searching;

public class SeparateEvenAndOdd {

	public static void main(String[] args) {
		int[] a = {1,33,24,16,11,4};
		separateEvenAndOdd(a);
		for(int i : a) {
			System.out.print(i+" ");
		}
	}
	
	static void separateEvenAndOdd(int[] a) {
		int i = 0, n = a.length - 1, temp;
		while(i < n) {
			while(a[i] % 2 == 0 && i < n) {
				i++;
			}
			while(a[n] % 2 == 1 && i < n) {
				n--;
			}
			if(i < n) {
				temp = a[i];
				a[i] = a[n];
				a[n] = temp;
			}
		}
	}

}
