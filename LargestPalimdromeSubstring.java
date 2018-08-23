package codingexercise;

public class LargestPalimdromeSubstring {
	public static void main(String[] args) {
	    String str = "2212111124569";
	    largestPalindromeSubstring(str);
	    
	  }
	  static void largestPalindromeSubstring(String str) {
	    int start = 0, end =0;
	    String largestPal = "";
	    for(int i = 1; i < str.length(); i++) {
	      start = i-1;
	      end = i+1;
	      while(start >=0 && end < str.length() && str.charAt(end) == str.charAt(start)) {
	        String palimStr = str.substring(start, end+1);
	        largestPal = palimStr.length() > largestPal.length() ? palimStr : largestPal;
	        start--;
	        end++;
	      }
	      start = i-1;
	      end = i;
	      while(start >=0 && end < str.length() && str.charAt(end) == str.charAt(start)) {
	        String palimStr = str.substring(start, end+1);
	        largestPal = palimStr.length() > largestPal.length() ? palimStr : largestPal;
	        start--;
	        end++;
	      }
	      
	    }
	    System.out.println(largestPal);
	  }

}
