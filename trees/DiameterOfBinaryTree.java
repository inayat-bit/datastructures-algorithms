package examples.tree;

import codingexercise.BinarySearchTree;

public class DiameterOfBinaryTree {
    
	static int diameter;
	public static void main(String[] args) {
		BinarySearchTree bst = LevelOrderTraversal.getBinaryTree();
		diameter(bst);
		System.out.println(diameter);
	}
	
	static int diameter(BinarySearchTree root) {
		//int left,right;
		if(root == null)
			return 0;
		int left = diameter(root.getLeft());
		int right = diameter(root.getRight());
		diameter = Math.max(diameter, left + right + 1);
		return Math.max(left, right) + 1;
	}

}
