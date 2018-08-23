package codingexercise;

import java.util.HashMap;

public class FirstUniqueCharacterOfString {
    
    static class CountIndex {
    	int count =1,index;
    	CountIndex(int index) {
    		this.index = index;
    	}
    	public void incCount() {
    		count++;
    	}
    }
    static HashMap<Character, CountIndex> map = new HashMap<>();
     static void getCharCount(String word) {
    	for(int i =0; i<word.length(); i++) {
    		if(map.containsKey(word.charAt(i))) {
    			map.get(word.charAt(i)).incCount();
    		} else {
    			map.put(word.charAt(i), new CountIndex(i));
    		}
    	}
    }
    static int getUniqueCharacter(String word) {
    	getCharCount(word);
    	int result = Integer.MAX_VALUE;
    	for(int i =0; i<word.length(); i++) {
    		if(map.get(word.charAt(i)).count == 1 && map.get(word.charAt(i)).index < result) {
    			result = map.get(word.charAt(i)).index;
    		}
    	}
    	return result;
    }
	public static void main(String[] args) {
		String word = "GeeksQuiz";
		int index = getUniqueCharacter(word);
		System.out.println("First unique character="+word.charAt(index));

	}

}
