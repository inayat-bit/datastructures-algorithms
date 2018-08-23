package codingexercise;

//A Java program to print all anagrams together
import java.util.Arrays;
import java.util.Comparator;
  class Word {
	String str; // to store word itself
	int index; // index of the word in the 
			// original array
	
	// constructor
	Word(String str, int index)
	{
		this.str = str;
		this.index = index;
	}
  }
	
	// Compare two words. Used in Arrays.sort() for 
	// sorting an array of words
	class CompStr implements Comparator<Word> {
		public int compare(Word a, Word b)
		{
			return a.str.compareTo(b.str);
		}
	}
	
//This code is contributed by Sumit Ghosh

public class GroupAnagrams {
    
	// Given a list of words in wordArr[],
		static void printAnagramsTogether(String wordArr[],
												int size) {
			// Step 1: Create a copy of all words present
			// in given wordArr. The copy will also have 
			// original indexes of words
            Word[] array = new Word[size];
			
			// One by one copy words from the 
			// given wordArray to dupArray
			for (int i = 0; i < size; ++i)
			{
				// create a word Object with the 
				// str[i] as str and index as i
				array[i] = new Word(wordArr[i], i);
			}
		
			// Step 2: Iterate through all words in 
			// dupArray and sort individual words.
			for (int i =0; i<size; i++) {
				char[] charArr = array[i].str.toCharArray();
				Arrays.sort(charArr);
				array[i].str = new String(charArr);
			}
			
		
			// Step 3: Now sort the array of words in 
			// dupArray
			
			Arrays.sort(array, new CompStr());
			// Step 4: Now all words in dupArray are together,
			// but these words are changed. Use the index 
			// member of word struct to get the corresponding
			// original word
			for (int i =0; i<size; i++) {
				System.out.print(wordArr[array[i].index]+ " ");
			}
	}
	public static void main(String[] args) {
		String wordArr[] = {"cat", "dog", "tac", "god", "act"};
		int size = wordArr.length;
		printAnagramsTogether(wordArr, size);

	}

}
