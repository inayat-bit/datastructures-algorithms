package examples.tree;

import java.util.LinkedList;
import java.util.Queue;

import codingexercise.BinarySearchTree;

public class HeightOfBinaryTree {
    
	static int getHeight(BinarySearchTree bst) {
		int height = 1;
		Queue<BinarySearchTree> queue = new LinkedList<>();
		queue.add(bst);
		queue.add(null);
		while(!queue.isEmpty()) {
			bst = queue.poll();
			if(bst == null) {
				if(!queue.isEmpty()) {
					queue.add(null);
					height++;
					System.out.println();
				}
			} else {
				if(bst.getLeft() != null) 
					queue.add(bst.getLeft());
				if(bst.getRight() != null) 
					queue.add(bst.getRight());
			}
			if(bst != null)
			System.out.print(bst.getData());
		}
		
		return height;
	}
	public static void main(String[] args) {
		BinarySearchTree bst = LevelOrderTraversal.getBinaryTree();
		System.out.println(getHeight(bst));
		System.out.println(recursiveHeight(bst));

	}
	
	static int recursiveHeight(BinarySearchTree root) {
		if (root == null)
			return 0;
		int leftHeight = recursiveHeight(root.getLeft());
		int rightHeight = recursiveHeight(root.getRight());
		return Math.max(leftHeight, rightHeight) + 1;
	}

}
