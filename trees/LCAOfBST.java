package examples.tree;

import java.util.HashMap;
import java.util.Map;

import codingexercise.BinarySearchTree;

public class LCAOfBST {
	
  public static void main(String[] args) {
	BinarySearchTree bst = LevelOrderTraversal.getBinaryTree();
	BinarySearchTree result = LCA(bst, 2, 3);
	System.out.println(result.getData());
	
  }
  
   static BinarySearchTree LCA(BinarySearchTree node, int n1, int n2) {
     if(node == null) {
    	 return null;
     }
     
     if(node.getData() < n1 && node.getData() < n2) {
    	 return LCA(node.getRight(), n1, n2);
     }
     if(node.getData() > n2 && node.getData() > n2) {
    	 return LCA(node.getLeft(), n1, n2);
     }
     return node;
   }

}
