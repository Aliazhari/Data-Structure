package Queue;

public class QueueLinkedList<E> implements Queue<E> {

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

	protected Node front;
	protected Node rear;
	protected int size;

	public QueueLinkedList() {

		front = null;
		rear = null;
		size = 0;
		;
	}

	@Override
	public void enqueue(E element) {

		// Running time is O(1)
		Node newNode = new Node(element, null);
		if (isEmpty())
			front = newNode;
		else
			rear.setNext(newNode);
		rear = newNode;

		size++;
	}

	@Override
	public E dequeue() {

		// Running time is O(1)
		if (isEmpty())
			return null;
		E e = front.getElement();
		front = front.getNext();
		if (size == 1)
			rear = null;
		size--;
		return e;
	}

	@Override
	public E front() {

		// Running time is O(1)
		if (isEmpty())
			return null;

		return front.getElement();
	}

	@Override
	public E rear() {

		// Running time is O(1)
		if (isEmpty())
			return null;

		return rear.getElement();
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public boolean isEmpty() {

		return (size == 0);
	}

	public void printQueue() {
		if (isEmpty())
			System.out.println("The Queue is Empty");
		else {
			Node walkingNode = front;
			while (walkingNode != null) {
				System.out.print(walkingNode.getElement() + " ");
				walkingNode = walkingNode.getNext();
			}
		}

	}

}
