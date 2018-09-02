package examples.tree;

import codingexercise.BinarySearchTree;

public class LeftViewOfBinaryTree {
    static int maxLevel = 0;
	public static void main(String[] args) {
	  BinarySearchTree node = LevelOrderTraversal.getBinaryTree();
	  leftViewOfBinaryTree(node);

	}
	
	static void leftViewOfBinaryTree(BinarySearchTree node) {
		leftViewOfBinaryTreeUtil(node, 1);
	}
	
	static void leftViewOfBinaryTreeUtil(BinarySearchTree node, int level) {
		if(node == null)
			return;
		if(maxLevel < level) {
			System.out.println(node.getData());
			maxLevel = level;
		}
		leftViewOfBinaryTreeUtil(node.getLeft(), level+1);
		leftViewOfBinaryTreeUtil(node.getRight(), level+1);
	}

}
