package Queue;

import java.util.Arrays;

/**
 * @File QueueArray.java
 * 
 * @author Ali Azhari
 * 
 */
public class QueueArray<E> implements Queue<E> {

	protected Object[] queue;
	protected int size;
	protected int capacity;

	public QueueArray(int capacity) {
		this.capacity = capacity;
		this.queue = new Object[capacity];
		this.size = 0;
	}

	@Override
	public void enqueue(E element) {

		// Takes O(1)

		if (size >= capacity)
			throw new ArrayIndexOutOfBoundsException("The Queue is full: the element '" + element + "' was not added");
		queue[size++] = element;

	}

	@SuppressWarnings("unchecked")
	@Override
	public E dequeue() {
		
		// Running time : O(n)
		
		if (size == 0)
			return null;
		
		E e = (E) queue[0];
		if (size > 1) 
		   for (int i = 0; i < size; i++) 
			  queue[i] = queue[i + 1]; 
		size--;
		
		return e;
	}


	@SuppressWarnings("unchecked")
	@Override
	public E front() {

		if (isEmpty())
			return null;

		return (E) queue[0];
	}

	@SuppressWarnings("unchecked")
	@Override
	public E rear() {

		if (isEmpty())
			return null;

		return (E) queue[size - 1];
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
			System.out.println("The queue is empty");
		else {
		Object[] newQueue = Arrays.copyOf(queue, size);
		System.out.println(Arrays.toString(newQueue));
		}
	}
}
