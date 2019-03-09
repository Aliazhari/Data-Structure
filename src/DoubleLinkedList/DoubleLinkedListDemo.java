package DoubleLinkedList;



/**
 * @author Ali
 *
 */

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		DoubleLinkedList<Integer> dlist = new DoubleLinkedList<Integer>();

		dlist.printList();
		dlist.addFirst(12);
		
		dlist.addFirst(10);
		
		dlist.addFirst(9);
		dlist.addLast(19);
		dlist.addLast(18);
		dlist.printList();
		
		dlist.addFirst(1);
		dlist.removeLast();
		dlist.printList();

	}

}
