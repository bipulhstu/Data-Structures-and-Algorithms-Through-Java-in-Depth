package CircularLinkedList;


public class Main {

	public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();
		
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(88);
		
		myList.insertLast(99999);
		
		myList.displayList();

	}

}
