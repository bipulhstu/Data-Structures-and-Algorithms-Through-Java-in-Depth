package SinglyLinkedList;

public class SinglyLinkedList {

	private Node first;
	private Node last;
	
	public SinglyLinkedList() {
		
	}
	public boolean isEmpty() {
		return (first == null);
	}
	
	//used to insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	public void insertLast(int data) {
		Node last = first;
		while(last.next != null) {
			last = last.next;
			///we'll loop until current is null
		}
		Node newNode = new Node();
		newNode.data = data;
		last.next = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (First -->Last): ");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
}
