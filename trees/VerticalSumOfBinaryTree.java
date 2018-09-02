package examples.tree;

import java.util.HashMap;
import java.util.Map;

import codingexercise.BinarySearchTree;

public class VerticalSumOfBinaryTree {

	public static void main(String[] args) {
	  BinarySearchTree bst = LevelOrderTraversal.getBinaryTree();
	  HashMap<Integer , Integer> hm = new HashMap<>();
	  verticalSum(bst, hm, 0);

	}
	static void verticalSum(BinarySearchTree node, HashMap<Integer, Integer> hm, int hd) {
		verticalSumUtil(node, hm, 0);
		for(Map.Entry<Integer, Integer> e: hm.entrySet()) {
			System.out.print(e.getValue()+ " ");
		}
		
	}
	
	static void verticalSumUtil(BinarySearchTree node, HashMap<Integer, Integer> hm, int hd) {
		if(node == null)
			return;
		verticalSumUtil(node.getLeft(), hm, hd-1);
		int prevsum = hm.get(hd) == null ? 0 : hm.get(hd);
		hm.put(hd, prevsum+node.getData());
		verticalSumUtil(node.getRight(), hm, hd+1);
	}

}
