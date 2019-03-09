package SingleLinkedList;

public class SingleLinkedListDemo {

	public static void main(String[] args) {
		SingleLinkedList<Integer> slist = new SingleLinkedList<Integer>();

		slist.printList();

		slist.addFirst(12);
		slist.printList();
		slist.addFirst(10);
		slist.printList();
		slist.addFirst(8);
		slist.printList();
		slist.addLast(14);
		slist.printList();
		slist.addLast(16);
		slist.printList();
		System.out.println("removing " + slist.removeFirst());
		slist.printList();
		System.out.println("removing " + slist.removeLast());
		slist.printList();

	}

}
