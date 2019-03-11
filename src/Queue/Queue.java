package Queue;

/**
 * @author Ali Azhari
 *
 * @param <E>
 */
public interface Queue<E> {
	
	public void enqueue(E element);
	public E dequeue();
	public E front();
	public E rear();
	public int size();
	public boolean isEmpty();

}
