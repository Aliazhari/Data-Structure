package PriorityQueue;

/** ****************************************
*  Author : Ali Azhari   
*  Created On : Mon Oct 10 2022
*  File : PriorityQueueInterface.java
****************************************** */

public interface PriorityQueueInterface<K, V> {
	
	int size();
	int capacity();
	boolean isEmpty();
	Entry<K, V> insert(K key, V value) throws IllegalArgumentException;
	Entry<K, V> max();
	Entry<K, V> removeMax();
	int leftChild(int node);
	int rightChild(int node);

	int parent(int node);

	boolean hasLeft(int node);

	boolean hasRight(int node);

}
