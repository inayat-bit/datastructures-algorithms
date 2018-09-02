package examples.linkedlist;

import examples.linkedlist.LinkedList.Node;

public class DeleteNodeWithPointer {

	public static void main(String[] args) {
		LinkedList llist = LinkedList.create();
		LinkedList.printList(llist.head);
        deleteNode(llist.head.next.next);
        LinkedList.printList(llist.head);
	}
	
	static void deleteNode(Node node) {
		Node temp = node.next;
		node.data = temp.data;
		node.next = temp.next;
		temp = null;
	}

}
