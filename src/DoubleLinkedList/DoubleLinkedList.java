package DoubleLinkedList;

/**
 * @author Ali
 *
 * @param <E>
 */
public class DoubleLinkedList<E> {

	
	protected static class Node<E> {

		private E element; // reference to the element of this node
		private Node<E> next; // reference to the next node of this node
		private Node<E> previous; // reference to the previous node of this node

		public Node(E element, Node<E> next, Node<E> previous) {

			this.element = element;
			this.next = next;
			this.previous = previous;
		}

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

		public Node<E> getPrevious() {
			return previous;
		}

		public void setPrevious(Node<E> previous) {
			this.previous = previous;
		}

		@Override
		public String toString() {
			return "Node [element=" + element + "]";
		}

	}

	protected Node<E> head;
	protected Node<E> tail;
	protected int size;

	public DoubleLinkedList() {
		head = new Node<E>(null, null, null);
		tail = new Node<E>(null, null, null);
		head.setNext(tail);
		tail.setPrevious(head);
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public Node<E> getHead() { // getting the first node
		return head;
	}

	public Node<E> getTail() {
		return tail;
	}

	public Node<E> getFirstNode() { // getting the first node
		return head.getNext();
	}

	public Node<E> getLastNode() {
		return tail.getPrevious();
	}

	public E getFirstElement() {
		if (head.getNext() == null)
			return null;
		return head.getNext().getElement();
	}

	public E getLastElement() {
		if (tail.getPrevious() == null)
			return null;
		return tail.getPrevious().getElement();
	}

	public void addFirst(E newElement) {

		Node<E> newNode = new Node<>(newElement, head.getNext(), head);
		head.setNext(newNode);
		newNode.getNext().setPrevious(newNode);
		size++;
	}

	public void addLast(E newElement) {

		Node<E> newNode = new Node<>(newElement, tail, tail.getPrevious());
		tail.getPrevious().setNext(newNode);

		tail.setPrevious(newNode);

		size++;
	}

	public E removeFirst() {

		if (isEmpty())
			return null;
		Node<E> node = head.getNext();
		head.setNext(node.getNext());
		head.getNext().setPrevious(head);
		size--;
		return node.getElement();

	}

	public E removeLast() {

	

		if (isEmpty())
			return null;

		Node<E> node = tail.getPrevious();
		
		node.getPrevious().setNext(tail);

		tail.setPrevious(node.getPrevious());

		return node.getElement();

	}

	public void printList() {
		Node<E> aNode = head.getNext();
		if (isEmpty())
			System.out.println("The list is empty");
		else {
			System.out.println("Printing list");
			while (aNode.getNext() != null) {
				System.out.println(aNode);
				aNode = aNode.getNext();
			}
		}
	}
}
