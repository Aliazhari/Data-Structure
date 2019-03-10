package Stack;

/**
 * @author Ali Azhari
 *
 * @param <E>
 */
public class StackLinkedList<E> implements Stack<E> {

	protected class Node {

		private E element;
		private Node next;

		public Node(E element, Node next) {
			this.element = element;
			this.next = next;
		}

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	protected Node top;
	protected int size;

	public StackLinkedList() {

		top = null;
		size = 0;
	}

	@Override
	public void push(E element) {

		Node newNode = new Node(element, top);
		top = newNode;
		size++;

	}

	@Override
	public E pop() {
		if (isEmpty())
			return null;
		Node aNode = top;
		top = top.getNext();
		size--;
		return aNode.getElement();

	}

	@Override
	public E top() {
		if (isEmpty())
			return null;
		return top.getElement();
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public boolean isEmpty() {

		return (size == 0);
	}
	
	public void printStack() {
		if (isEmpty())
			System.out.println("The stack is Empty");
		else {
			Node walkingNode = top;
			while (walkingNode != null) {
				System.out.print(walkingNode.getElement() + " ");
				walkingNode = walkingNode.getNext();
			}
		}
		
	}

}
