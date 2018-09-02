package examples.tree;

import java.util.LinkedList;
import java.util.Queue;

import codingexercise.BinarySearchTree;

public class SearchingElementInBinaryTree {
    static boolean isElement(BinarySearchTree root, int data) {
    	if(root == null)
    		return false;
    	BinarySearchTree temp;
    	Queue<BinarySearchTree> queue = new LinkedList<>();
    	queue.add(root);
    	while(!queue.isEmpty()) {
    		temp = queue.poll();
    		if(temp.getData() == data)
    			return true;
    		if(temp.getLeft() != null)
    			queue.add(temp.getLeft());
    		if(temp.getRight() != null)
    			queue.add(temp.getRight());
    	}
    	queue.clear();
    	return false;
    }
    
    public static void main(String args[]) {
    	BinarySearchTree bst = LevelOrderTraversal.getBinaryTree();
    	System.out.println(isElement(bst, 7));
    	System.out.println(isElementRecursive(bst, 1));
    }
    static boolean isElementRecursive(BinarySearchTree root, int data) {
    	if(root.getData() == data)
    		return true;
        return (isElementRecursive(root.getLeft(), data) || isElementRecursive(root.getRight(), data)); 	
    }
}
