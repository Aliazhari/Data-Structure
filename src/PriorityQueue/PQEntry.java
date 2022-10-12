package PriorityQueue;
/** ****************************************
*  Author : Ali Azhari   
*  Created On : Mon Oct 10 2022
*  File : PQEntry.java
****************************************** */
public class PQEntry<K, V> implements Entry<K, V> , Comparable<Entry<K,V>>{

	private K key; 
	private V value;
	
	
	public PQEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		
		return key;
	}

	@Override
	public V getValue() {
		
		return value;
	}

	public void setKey(K key) {
		this.key = key;
	}
	
	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "PQEntry [key=" + key + ", value=" + value + "]";
	}

	@Override
	public int compareTo(Entry<K, V> o) {
		if ((Integer) this.key == (Integer) o.getKey())
			return 0;
		if ((Integer) this.key > (Integer) o.getKey()) 
			return 1;
		else
			return -1;
	}
	
	

}
