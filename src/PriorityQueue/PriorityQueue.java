package PriorityQueue;

/**
 * @File PriorityQueue.java
 * 
 * @author Ali Azhari

 * @param <K>
 * @param <V>
 */
public interface PriorityQueue<K, V> {
	
	int size();
	boolean isEmpty();
	Entry<K, V> insert(K key, V value) throws IllegalArgumentException;
	Entry<K, V> min();
	Entry<K, V> removeMin();

}
