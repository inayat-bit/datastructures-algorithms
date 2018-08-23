package codingexercise;

public class FirstUniqueCharacter {
	
	static char[] getCountArray(String input) {
		final int NO_OF_CHARS = 128;
		char[] count = new char[NO_OF_CHARS];
		for (int i = 0; i<input.length(); i++) {
			 count[input.charAt(i)]++;
		}
		return count;
	}
	
	static char getFirstUniqueCharacter(String input) {
		char[] count = getCountArray(input);
		int index = 0;
		for (int i=0; i<input.length(); i++) {
			//System.out.println((int)count[input.charAt(i)]);
			if(count[input.charAt(i)] == 1) {
				index = i;
				break;
			}
		}
		return input.charAt(index);
	}
	
	public static void main(String args[]) {
		String input = "aaacaabaa";
		System.out.println(getFirstUniqueCharacter(input));
	}

}
