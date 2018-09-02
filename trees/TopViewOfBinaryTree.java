package examples.tree;

import java.util.HashMap;

import codingexercise.BinarySearchTree;

public class TopViewOfBinaryTree {

	public static void main(String[] args) {
		BinarySearchTree node = LevelOrderTraversal.getBinaryTree();
		HashMap<Integer, Integer> hm = new HashMap<>();
		topViewTree(node, hm, 0);
		hm.values().forEach(v -> {System.out.println(v);});

	}
	
	static void topViewTree(BinarySearchTree node, HashMap<Integer, Integer> hm, int hd) {
		if(node == null)
			return;
		if(!hm.containsKey(hd))
			  hm.put(hd, node.getData());
		topViewTree(node.getLeft(), hm, hd - 1);
		topViewTree(node.getRight(), hm, hd + 1);
	}

}
