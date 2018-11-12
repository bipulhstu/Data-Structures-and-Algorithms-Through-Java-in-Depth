package LinkedList;

public class LinkedList {

	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 3;
		
		Node nodeC = new Node();
		nodeC.data = 7;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		System.out.println("Length of nodeA is "+listLength(nodeA)); //4
		System.out.println("Length of nodeA is "+listLength(nodeB)); //3
		System.out.println("\n\nLinked List is : ");
		displayLinkedList(nodeA);

		
	}
	public static int listLength(Node a) {
		int length = 0;
		Node currentNode = a;
		while(currentNode != null) {
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}
	public static void displayLinkedList(Node a) {
		Node currentNode = a;
		while(currentNode != null) {
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
}
