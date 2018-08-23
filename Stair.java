package codingexercise;

public class Stair {
	public static void main(String[] args) {
	    System.out.println("ways "+countWays(3));
	  }
	  static int countWays(int n) {
	    return fibb(n);
	  }
	  static int fibb(int n) {
	    int fib[] = new int[n+1];
	    fib[0] = 1;
	    fib[1] = 1;
	    for(int i = 2; i <= n; i++) {
	      fib[i] = fib[i-2] + fib[i-1];
	    }
	    return fib[n];
	  }
}
