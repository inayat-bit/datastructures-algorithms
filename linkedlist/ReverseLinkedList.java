package examples.linkedlist;

import examples.linkedlist.LinkedList.Node;

public class ReverseLinkedList {
	static Node head;
	public static void main(String[] args) {
		LinkedList llist = LinkedList.create();
		LinkedList.printList(llist.head);
		reverse(llist.head);
		LinkedList.printList(head);
	}
	static void reverse(Node node) {
		if(node.next == null) {
			head = node;
			return;		
		}
		reverse(node.next);
		Node temp = node.next;
		temp.next = node;
		node.next =  null;
	}
	
	

}
