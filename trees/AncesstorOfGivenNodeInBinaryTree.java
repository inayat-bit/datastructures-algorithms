package examples.tree;

import codingexercise.BinarySearchTree;

public class AncesstorOfGivenNodeInBinaryTree {
	public static void main(String[] args) {
		BinarySearchTree node = LevelOrderTraversal.getBinaryTree();
	    printAncesstors(node, 7);	
	}
	
	static boolean printAncesstors(BinarySearchTree node, int target) {
		if(node == null)
			return false;
		if(node.getData() == target)
			return true;
		if(printAncesstors(node.getLeft(), target) || printAncesstors(node.getRight(), target)) {
			System.out.println(node.getData());
			return true;
		}
		return false;	
	}
}
