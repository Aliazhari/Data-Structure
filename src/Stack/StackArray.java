package Stack;

import java.util.Arrays;

/**
 * @author Ali Azhari
 *
 * @param <E>
 */
public class StackArray<E> implements Stack<E> {

	protected Object[] stack;
	protected int size;
	protected int capacity;

	public StackArray(int max) {

		this.capacity = max;
		this.stack = new Object[capacity];
		this.size = 0;
	}

	@Override
	public void push(E element) {
		
		// Takes O(1)
		
		if (size >= capacity)
			throw new ArrayIndexOutOfBoundsException("The stack is full: the element '" + element + "' is not added");
		stack[size++] = element;

	}

	@SuppressWarnings("unchecked")
	@Override
	public E pop() {
		
		// Takes O(1)
		
		if (size == 0)
			return null;

		return (E) stack[--size];
	}

	@SuppressWarnings("unchecked")
	@Override
	public E top() {

		if (size == 0)
			return null;

		return (E) stack[size];
	}

	@Override
	public int size() {
		
		// Takes O(1)
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		// Takes O(1)
		
		return (size == 0);
	}
	
	public void printStack() {
		if (isEmpty())
			System.out.println("The stack is empty");
		else {
		Object[] newStack = Arrays.copyOf(stack, size);
		System.out.println(Arrays.toString(newStack));
		}
	}

}
