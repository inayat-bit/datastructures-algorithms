package codingexercise;

public class MissingCharacterInPangram {

	public static void main(String[] args) {
		String str = "abcdefghi  mnopqrstuvwxy";
		str = str.trim();
		str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for (char c = 'a'; c<='z'; c++) {
			if (str.indexOf(c) < 0)
				sb.append(c);
		}
        System.out.println("Missing characters in panagram "+sb.toString());
	}

}
