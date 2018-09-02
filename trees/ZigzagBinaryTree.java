package examples.tree;

import java.util.Stack;

import codingexercise.BinarySearchTree;

public class ZigzagBinaryTree {

	public static void main(String[] args) {
	  BinarySearchTree bst = LevelOrderTraversal.getBinaryTree();
	  zigzagTraversal(bst);
	}
	
	static void zigzagTraversal(BinarySearchTree node) {
		Stack<BinarySearchTree> curStack = new Stack<>();
		Stack<BinarySearchTree> nextStack = new Stack<>();
		boolean leftToRight = true;
		curStack.push(node);
		while(!curStack.isEmpty()) {
			node = curStack.pop();
			if(node != null) {
				System.out.print(node.getData() + " ");
			}
			if(leftToRight) {
				if(node.getLeft() != null)
					nextStack.push(node.getLeft());
				if(node.getRight() != null)
					nextStack.push(node.getRight());
			} else {
				if(node.getRight() != null)
					nextStack.push(node.getRight());
				if(node.getLeft() != null)
					nextStack.push(node.getLeft());
			}
			if(curStack.isEmpty()) {
				leftToRight = !leftToRight;
				Stack<BinarySearchTree> temp = curStack;
				curStack = nextStack;
				nextStack = temp;
			}
		}
	}

}
 