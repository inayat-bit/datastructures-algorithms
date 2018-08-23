package codingexercise;

class PowerOfTen {
	  public static void main(String[] args) {
	    System.out.println(isPowerOfTen(0.01));
	  }
	  
	  static boolean isPowerOfTen(double n) {
		  if(n==0) return true;

			if (n < 1) {

				while (n < 1)

					n = n * 10;

			}

			// n=1

			int pow = 1;

			while (pow < n) {

				pow *= 10;

			}

			return pow == n;
	  }
	}
