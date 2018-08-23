package codingexercise;

public class LongestRepeatingIndex {
    
	static void longestRepeatingIndex(String str) {
		int maxLength = 0;
		int startIndex =0;
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length;) {
			 int length = 0;
		     int index = i;
		     char c = charArr[i];
		     while(i<charArr.length && charArr[i] == c) {
		    	 i++;
		    	 length++;
			}
		    if(length > maxLength) {
		    	maxLength = length;
		    	startIndex = index;
		    }
		}
		System.out.println("Longest repeating index = "+"["+startIndex+","+maxLength+"]");
	}
	public static void main(String[] args) {
		longestRepeatingIndex("aabbbbddcc");

	}

}
