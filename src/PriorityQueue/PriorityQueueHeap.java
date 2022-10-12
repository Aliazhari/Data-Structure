/** ****************************************
*  Author : Ali Azhari   
*  Created On : Mon Oct 10 2022
*  File : PriorityQueue.java

*	Description: This is  Min heap implementation of a priority queue. 
 *  Children are geater than parents.
****************************************** */
package PriorityQueue;

import java.util.ArrayList;
import java.util.Arrays;

public class PriorityQueueHeap<K, V> implements PriorityQueueInterface<K, V> {

	ArrayList<Entry<K,V>> pq;
	int size;
	int capacity;

	public PriorityQueueHeap() {
		this(2);
	}

	public PriorityQueueHeap(int capacity) {
		this.size = 0;
		this.capacity = capacity;
		
		pq = new ArrayList<>();
	}

	private void swap(int i, int j) {
		Entry<K, V> temp = pq.get(i);
		pq.set(i, pq.get(j));
		pq.set(j, temp);

	}
	private void upHeap(int i) {
		int current = i;
		while (current > 0) {
			int parent = parent(current);
			if (  ((PQEntry<K, V>) pq.get(current)).compareTo(pq.get(parent)) < 0 )
				break;
			swap(current, parent);
			current = parent;

		}
	}
	@Override
	public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
		if (isFull())
			throw new IllegalArgumentException("The Heap is full");
		Entry<K, V> entry = new PQEntry<>(key, value);
		pq.add(entry);
		size++;
		upHeap(size - 1);
		return entry;
	}


	@Override
	public Entry<K, V> max() {
		return pq.get(0);
	}

	private void downheap() {
		int current = 0;
		int child;
		
		while (current < size ) {
			if (! hasLeft(current))
				break;
			if (hasRight(current)) {
				int left = leftChild(current);
				int right = rightChild(current);
				child = (((PQEntry<K, V>) pq.get(right)).compareTo(pq.get(left)) > 0) ? right : left;
			}
			else {
				child = leftChild(current);
			}
			swap(current, child);
			current = child;
		}
	}

	@Override
	public Entry<K, V> removeMax()  {
		if (isEmpty())
			return null;
		Entry<K, V> temp = pq.get(size-1);
		pq.set(0, temp);
		size--;
		downheap();
		return temp;
	}

	@Override
	public int size() {

		return size;
	}
	@Override
	public int capacity() {
	
		return capacity;
	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	private boolean isFull() {
		return (size == capacity );
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		String thePQ = "";
		for (int i = 0; i < size; i++) {
			thePQ += pq.get(i) + "\n";
		}
		thePQ += "Size=" + size;
		return thePQ;
	}

	@Override
	public int leftChild(int node) {
	
		return (node * 2 + 1);
	}

	@Override
	public int rightChild(int node) {
		
		return (node * 2 + 2);
	}

	@Override
	public int parent(int node) {
	
		return ((node - 1) / 2);
	}

	@Override
	public boolean hasLeft(int node) {
		return (node * 2 + 1 < size);
	}

	@Override
	public boolean hasRight(int node) {
		
		return  (node * 2 + 2 < size);
	}

	



}