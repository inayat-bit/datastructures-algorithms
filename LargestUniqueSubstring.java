package codingexercise;

import java.util.HashMap;

public class LargestUniqueSubstring {
	public static void main(String[] args) {
	    String str = "aaabcbdeaff";
	    largestUniqueSubstring(str);
	    
	  }
	  static void largestUniqueSubstring(String str) {
	    char[] ch = str.toCharArray();
	    HashMap<Character, Integer> hm = new HashMap<>();
	    int startIndex =0, maxLength = 0;
	    for(int i = 0; i<ch.length; ) {
	      int index = i;
	      int length = 0;
	      while(i<ch.length && !hm.containsKey(ch[i])) {
	        hm.put(ch[i], i);
	        length++;
	        i++;
	      }
	      if(maxLength < length) {
	        maxLength = length;
	        startIndex = index;
	      }
	      if(i<ch.length) {
	        i = hm.get(ch[i])+1;
	      }
	      hm.clear();
	    }
	    System.out.println(str.substring(startIndex, startIndex+maxLength));
	  }

}
