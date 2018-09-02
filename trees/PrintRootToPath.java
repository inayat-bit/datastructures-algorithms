package examples.tree;

import java.util.LinkedList;
import java.util.Queue;

import codingexercise.BinarySearchTree;

public class PrintRootToPath {

	public static void main(String[] args) {
	  BinarySearchTree bst = LevelOrderTraversal.getBinaryTree();
	  int[] path = new int[256];
	  int pathLength = 0;
	  printRootToLeaf(bst, path, pathLength);	  
	}
	
	static void printRootToLeaf(BinarySearchTree root, int[] path, int pathLength) { 
		if(root == null)
			return;
		path[pathLength] = root.getData();
		pathLength++;
		if(root.getLeft() == null && root.getRight() == null) {
			printArray(path, pathLength);
		} else {
		  printRootToLeaf(root.getLeft(), path, pathLength);
		  printRootToLeaf(root.getRight(), path, pathLength);
		}
	}
	static void printArray(int[] path, int pathLength) {
		for(int i =0; i<pathLength; i++) {
			System.out.print(path[i] + " ");
		}
		System.out.println();
	}

}
