package codingexercise;

public class BinarySearchTree {
	BinarySearchTree left;
	BinarySearchTree right;
	int data;
	
	public BinarySearchTree getLeft() {
		return left;
	}
	public void setLeft(BinarySearchTree left) {
		this.left = left;
	}
	public BinarySearchTree getRight() {
		return right;
	}
	public void setRight(BinarySearchTree right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinarySearchTree(int data) {
		this.data = data;
	}
	public static BinarySearchTree insert(BinarySearchTree root, int data) {
		if(root == null) {
			return new BinarySearchTree(data);
		}
		if(data > root.data)
			root.right = insert(root.right, data);
		else
			root.left = insert(root.left, data);
		return root;
	}
	static void display(BinarySearchTree root) {
	    if(root != null) {
	      display(root.left);
	      System.out.print(root.data);
	      display(root.right);
	    }
	  }
	  static void postorder(BinarySearchTree root) {
	    if(root != null) {
	      postorder(root.left);
	      postorder(root.right);
	      System.out.print(root.data);
	    }
	  }
	  static void preorder(BinarySearchTree root) {
	    if(root != null) {
	      System.out.print(root.data);
	      preorder(root.left);
	      preorder(root.right);
	    }
	  }
	  public static void main(String[] args) {
		BinarySearchTree node = null;
	    node = insert(node , 6);
	    node = insert(node, 5);
	    node = insert(node, 8);
	    node = insert(node, 4);
	    display(node);
	    System.out.println("");
	    preorder(node);
	    System.out.println("");
	    postorder(node);
	  }

}
