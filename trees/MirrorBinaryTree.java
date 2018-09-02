package examples.tree;

import java.util.LinkedList;
import java.util.Queue;

import codingexercise.BinarySearchTree;

public class MirrorBinaryTree {

	public static void main(String[] args) {
	BinarySearchTree bst = LevelOrderTraversal.getBinaryTree();
	LevelOrderTraversal.levelOrderTraversal(bst);
	convertToMirrorImage(bst);
	LevelOrderTraversal.levelOrderTraversal(bst);
	}
	static void convertToMirrorImage(BinarySearchTree node) {
		Queue<BinarySearchTree> queue = new LinkedList<>();
		//BinarySearchTree temp;
		queue.add(node);
		while(!queue.isEmpty()) {
			node = queue.poll();
			BinarySearchTree temp = node.getLeft();
			node.setLeft(node.getRight());
			node.setRight(temp);
			if(null != node.getLeft())
				queue.add(node.getLeft());
			if(null != node.getRight())
				queue.add(node.getRight());
		}
	}

}
