package examples.searching;

public class MostRepeatedElement {

	public static void main(String[] args) {
		int a[] = {1,2,3,3,4,5,3,7};
		System.out.println(getElement(a));

	}
	
	static int getElement(int a[]) {
		int max = 0, maxIndex = 0;
		int n = a.length;
		for(int i = 0; i < n; i++) {
			a[a[i]%n] += n;
		}
		for(int i = 0; i < n; i++) {
			int element = a[i]/n;
			if(element > max) {
				max = element;
				maxIndex = i;
			}
		}
		return maxIndex;
	}

}
