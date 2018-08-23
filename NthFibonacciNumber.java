package codingexercise;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		int nth = 10;
		int result = nthFibonacciNumberNumber(nth);
		System.out.println(result);
		int result1 = nthFibonacciNumber(nth);
		System.out.println(result1);

	}
	
	static int nthFibonacciNumber(int n) {
		if(n < 0) {
			System.out.println("Invalid Output");
			return 0;
		}
		if(n <=1) {
			return n;
		}
		else 
			return nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
	}
	
	static int nthFibonacciNumberNumber(int n) {
		int fib[] = new int[n+2];
		fib[0] = 0;
		fib[1] = 1;
		for (int i =2; i<n + 2; i++) {
		   fib[i] = fib[i-2] + fib[i-1];
		}
		return fib[n];
	}
	

}
