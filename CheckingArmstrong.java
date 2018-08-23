package codingexercise;

class CheckingArmstrong {
	  public static void main(String[] args) {
	    boolean result = isArmstrong(153);
	    System.out.println(result);    
	  }
	  
	  static boolean isArmstrong(int n) {
	    int order = getOrder(n);
	    System.out.println(order);
	    int result = 0;
	    int temp = n;
	    while (temp > 0) {
	      result = result + (int) Math.pow(temp%10, order);
	      temp = temp/10;
	    }
	    return (result == n);
	}

	  static int getOrder(int n) {
	    int count = 0;
	    while (n > 0) {
	      n = n/10;
	      count++;
	    }
	    return count;
	  }
	}