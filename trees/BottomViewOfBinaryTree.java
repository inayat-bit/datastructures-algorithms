package examples.tree;

import java.util.HashMap;

import codingexercise.BinarySearchTree;

public class BottomViewOfBinaryTree {

	public static void main(String[] args) {
		BinarySearchTree node = LevelOrderTraversal.getBinaryTree();
		HashMap<Integer, Integer> hm = new HashMap<>();
		bottomViewTree(node, hm, 0);
		hm.values().forEach(v -> {System.out.println(v);});
	}
	
	static void bottomViewTree(BinarySearchTree node, HashMap<Integer, Integer> hm, int hd) {
		if(node == null)
			return;
		bottomViewTree(node.getLeft(), hm, hd - 1);
		hm.put(hd, node.getData());
		bottomViewTree(node.getRight(), hm, hd + 1);
	}
}
