package SingleLinkedList;


/**
 * @author Ali
 *
 * @param <E>
 */
public class SingleLinkedList<E> {

	protected static class Node<E> {

		private E element; // reference to the element of this node
		private Node<E> next; // reference to the next node of this node

		public Node(E element, Node<E> next) {
			
			this.element = element;
			this.next = next;
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

		@Override
		public String toString() {
			return "Node [element=" + element + "]";
		}

	}

	protected Node<E> head;
	protected Node<E> tail;
	protected int size;

	public SingleLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}

	public Node<E> getHead() {  // getting the first node
		return head;
	}

	public Node<E> getTail() {
		return tail;
	}
	
	public E getFirstElement() {
		if (head == null) return null;
		return head.getElement();
	}
	
	public E getLastElement() {
		if (tail == null) return null;
		return tail.getElement();
	}

	public void addFirst(E newElement) {

		head = new Node<E>(newElement, head);
		if (isEmpty()) 
			tail = head;
		size++;
	}
	
	public void addLast(E newElement) {
		
		// node will eventually be the tail
		Node<E> newNode = new Node<>(newElement, null);
		
		  
	    if (isEmpty())
	      head = newNode;                         // special case: previously empty list
	    else
	      tail.setNext(newNode);                  // new node after existing tail
	    tail = newNode;                           // new node becomes the tail
	    size++;
	}
	
	public E removeFirst() {
		
		if (isEmpty()) 
			return null;
		Node<E> node = head;
		head = head.getNext();
		if (size() == 1)
			tail = null;
		size--;
		return node.getElement();
		
	}
	
public E removeLast() {
	
	// BigO = n
		
		if (isEmpty()) 
			return null;
		Node<E> node = head;
		if(size() == 1) {
			head = null;
			tail = null;
			return node.getElement();
		}
		while (node.getNext().getNext() != null) {
			node = node.getNext();
			
		}
		E element = node.getNext().getElement();
		tail = node;
		tail.setNext(null);
		size--;
		return  element;
		
		
	}

	public void printList() {
		Node<E> aNode = head;
		if (head == null)
			System.out.println("The list is empty");
		else {
		System.out.println("Printing list");
		while (aNode != null) {
			System.out.println(aNode);
			aNode = aNode.getNext();
		}
		}
	}
}
