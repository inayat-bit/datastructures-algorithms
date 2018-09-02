package examples.linkedlist;

import examples.linkedlist.LinkedList.Node;

public class ReverseLinkedListIterative {
	public static void main(String[] args) {
	  LinkedList list = LinkedList.create();
	  Node node = reverse(list.head);
	  LinkedList.printList(node);
	}
	
	static Node reverse(Node node) {
		Node temp = null, next = null;
		while (node != null) {
		  next = node.next;
		  node.next = temp;
		  temp = node;
		  node = next;
		}
		return temp;
	}

}
