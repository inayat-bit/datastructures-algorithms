package codingexercise;

import java.util.HashSet;
import java.util.Set;

public class LargestWordInDictionary {
	public static void main(String args[]) {
	String[] dic = {"ale", "apple", "monkey", "plea"};
	String str = "abpcplea";
	String[] dic1 = {"to","toe","toes","doe","dog","god","dogs","book","banana"};
	String str1 = "dsetog";
	System.out.println(getLargestWord(dic1, str1));
	}
	
	static Set<String> getLargestWord(String[] dic, String str) {
		int length = 0;
		HashSet<String> results = new HashSet<>();
		for(String word: dic) {
			if(length <= word.length() && isSubsequence(word, str)) {
				if(length < word.length()) results.clear();
				length = word.length();
				results.add(word);
			}
		}
		return results;
	}
	
	static boolean isSubsequence(String word, String str) {
		for (int i = 0; i < word.length(); i++) {
			if (str.indexOf(word.charAt(i)) < 0) {
				return false;
			}
		}
		return true;
	}

}
