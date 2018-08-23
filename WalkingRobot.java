package codingexercise;

public class WalkingRobot {
	public static void main(String[] args) {
	    int x = 0, y = 0;
	    String str = "UDDLLRUUUDUURUDDUULLDRRRR";
	    for (int i =0; i<str.length(); i++) {
	      char ch = str.charAt(i);
	      if(ch == 'U')
	        y++;
	      else if(ch == 'D')
	        y--;
	      else if(ch == 'L')
	        x--;
	      else if(ch == 'R')
	        x++;
	    }
	    System.out.println("x = "+x+" y = "+y);
	    
	  }

}
