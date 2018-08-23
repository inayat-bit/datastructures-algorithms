package codingexercise;

public class PrintPascalTriangle {
	public static void main(String args[]) {
		System.out.println(getElementFromPascal(5,2));
		System.out.println(getElementFromPascalTree(2,5));
	}
	
	static int getElementFromPascal(int row, int col) {
		int arr[][] = new int[row+1][row+1];
	// Iterate through every line and print integer(s) in it
	  for (int line = 0; line <= row; line++)
	  {
	    // Every line has number of integers equal to line number
	    for (int i = 0; i <= line; i++)
	    {
	      // First and last values in every row are 1
	      if (line == i || i == 0)
	           arr[line][i] = 1;
	      else // Other values are sum of values just above and left of above
	           arr[line][i] = arr[line-1][i-1] + arr[line-1][i];
	      /*if(line == row && i == col)
	        break;*/
	      System.out.print(arr[line][i] + " ");
	    }
	    System.out.println();
	  }
	  return arr[row][col];
	}
	
	static int getElementFromPascalTree(int col,int row){

	      if(col > row){

	          return 0;

	      }

	      if(col == 0 || row == col){

	        return 1;

	      }

	      int value = getElementFromPascalTree(col,row-1) + getElementFromPascalTree(col-1,row-1);
	      System.out.println(value);
	      return value;
	  }

}
