package codingexercise;

public class OccuranceFollowedByChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "SSSSSTTPPQ";		
      countChars(s);

	}

	

	private static void countChars(String s) {		

		for(int i=0;i<s.length();) {

			int len=0;

			char c=s.charAt(i);

			while(i<s.length() && c==s.charAt(i)) {

				i++;

				len++;

			}

			System.out.print(""+len+c);

		}

	}

}
