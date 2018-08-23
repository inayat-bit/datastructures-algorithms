package codingexercise;

public class AddFraction {
  public static void main(String args[]) {
	int[] f1 = {2,9};
    int[] f2 = {1,6};
    int[] res = addFraction(f1, f2);
    System.out.println(res[0]+"/"+res[1]);
  }
  static int[] addFraction(int[] f1, int[] f2) {
    int res[] = new int[2];
    int num = f1[0]*f2[1] + f2[0]*f1[1];
    int den = f2[1]*f1[1];
    int gcd = getGCD(num,den);
    res[0] = num/gcd;
    res[1] = den/gcd;
    return res;
  }
  static int getGCD(int num1, int num2) {
    if(num1 == 0)
      return num2;
    return getGCD(num2%num1, num1);
  }
}
