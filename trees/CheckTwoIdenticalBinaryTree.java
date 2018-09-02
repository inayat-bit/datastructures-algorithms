package examples.tree;

import java.util.LinkedList;
import java.util.Queue;

import codingexercise.BinarySearchTree;

public class CheckTwoIdenticalBinaryTree {

	public static void main(String[] args) {
		BinarySearchTree bst1 = LevelOrderTraversal.getBinaryTree();
		BinarySearchTree bst2 = LevelOrderTraversal.getBinaryTree();
		System.out.println(recursive(bst1, bst2));
		System.out.println(iterative(bst1, bst2));

	}
	static boolean recursive(BinarySearchTree root1, BinarySearchTree root2) {
		if(null == root1 && null == root2)
			return true;
		if(root1 == null || root2 == null)
			return false;
		return (recursive(root1.getLeft(), root2.getLeft()) && recursive(root1.getRight(), root2.getRight()));
	}
	
	static boolean iterative(BinarySearchTree root1, BinarySearchTree root2) {
		Queue<BinarySearchTree> queue1 = new LinkedList<>();
		Queue<BinarySearchTree> queue2 = new LinkedList<>();
		queue1.add(root1);
		queue2.add(root2);
		if(null == root1 && null == root2)
			return true;
		if(root1 == null || root2 == null)
			return false;
		while(!queue1.isEmpty() && !queue2.isEmpty()) {
			root1 = queue1.poll();
			root2 = queue2.poll();
			if(root1.getData() != root2.getData())
				return false;
			if(root1.getLeft() != null && root2.getLeft() != null) {
				queue1.add(root1.getLeft());
				queue2.add(root2.getLeft());
			} else if(root1.getLeft() != null || root2.getLeft() != null) {
				return false;
			}
			if(root1.getRight() != null && root2.getRight() != null) {
				queue1.add(root1.getRight());
				queue2.add(root2.getRight());
			} else if(root1.getRight() != null || root2.getRight() != null) {
				return false;
			}
		}
		return true;
	}

}
