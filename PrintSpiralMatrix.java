package codingexercise;

public class PrintSpiralMatrix {
	public static void main(String[] args) {
	    int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
	    printSpiral(3,3, matrix);
	  }
	  
	  static void printSpiral(int m, int n, int[][] mat) {
	    int k = 0,l=0;
	    while(k < m && l < n) {
	    for (int i = l; i < n; i++) {
	      System.out.print(mat[k][i]);      
	    }
	    k++;
	    for (int i = k; i < n; i++) {
	      System.out.print(mat[i][n-1]);
	    }
	    n--;
	    if(k < m) {
	    for(int i = n-1; i >=0; i--) {
	      System.out.print(mat[n][i]);
	    }
	    m--;
	    }
	    if(l < n) {
	    for(int i = m-1; i>0; i--) {
	      System.out.print(mat[i][l]);
	    }
	    l++;
	    }
	  }
	  }
}
