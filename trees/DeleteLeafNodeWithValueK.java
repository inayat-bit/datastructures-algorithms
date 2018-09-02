package examples.tree;

class Node {
    int data;
    Node left;
    Node right;
 
    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class DeleteLeafNodeWithValueK {

	static void postOrder(Node root)
    {
       if (root == null)
          return;
       System.out.print(root.data + " ");
       postOrder(root.left); 
       postOrder(root.right);
    }
 
    // Driver Code
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(5);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(1);
        root.right.left = new Node(5);
 
        System.out.println("Nodes in postorder before deletion");
        postOrder(root);
        System.out.println();
        System.out.println("Nodes in post order after required deletion");
        int k = 5;
        delLeafValueK(root, k);
        postOrder(root);
        System.out.println();
    }
	
	static Node delLeafValueK(Node root, int k)
    {
        if (root == null)
            return null;
 
        root.left = delLeafValueK(root.left, k);
        root.right = delLeafValueK(root.right, k);
 
        // If the node is leaf, and its 
        // value is equal to k
        if ((root.left == null &&
             root.right == null) && 
             root.data == k)
            return null;
 
        return root;
    }

}
