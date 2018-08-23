package codingexercise;

public class PowerOfAnotherNumber {

	public static void main(String[] args) {
		System.out.println(isPowerOfAnother(1,20));
		System.out.println(isPowerOfAnother(2, 128));
        System.out.println(isPowerOfAnother(2, 30));

	}
	static boolean isPowerOfAnother(int x, int y) {
		if(x == 1)
			return (y == 1);
		int pow = 1;
		while(pow < y) {
			pow = pow*x;
		}
		return (pow == y);
	}

}
