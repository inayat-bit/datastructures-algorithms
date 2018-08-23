package codingexercise;

public class MinimumDistanceBetweenWords {
	public static void main(String[] args) {	    

		   // String s="heyy how   are you ? how you   are doing?";

			//String s="cent advance, be               ";

		    	String w1="how",w2="are";    	    

		    String s="One office for loan of money for customs calc of goods , "

			+ "which by a plain method be so ordered that " + "the merchant might with ease pay the highest "

			+ "customes down, and so, by allowing the bank " + "four per cent advance, be first to secure "

			+ "the $10 per cent which the king allows for prompt one     true one";

		    String s1 = "one";

		    String s2 = "true";
            String str = "This is      Sapient Office";
		    //System.out.println(getMinDIstance(s,s1,s2));
		    System.out.println(minimumDistance(str));

		   // System.out.println(getMinDIstance(s,"office", "loan") == 10);

		    //System.out.println(getMinDIstance(s,"plain", "method") == 7 && getMinDIstance(s,"calc", "goods") == 8);

		    

		  }

		  

		    static double minimumDistance(String input) {
			    String[] words = input.split(" ");
			    int cur = 0;
			    double d1 = 0, d2 = Integer.MAX_VALUE, minimumDistance = Integer.MAX_VALUE;
			    String w1 = "is";
			    String w2 = "Office";
			    for (String word: words) {
			     // if(word.equals(" ")) cur++;
			      if(word.equals(w1)) {
			        d1 = cur + Math.ceil(w1.length()/2);
			      }
			      if(word.equals(w2)) {
			        d2 = cur + Math.ceil(w2.length()/2);
			      }
			      if(Math.abs(d2 - d1) < minimumDistance) {
			        minimumDistance = Math.abs(d2-d1);
			      }
			      if(!word.isEmpty())
			      cur += word.length()+1;
			    }
			    return minimumDistance;
			  }
}
