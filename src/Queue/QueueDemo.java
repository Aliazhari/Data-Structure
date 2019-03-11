package Queue;

import Stack.StackLinkedList;

public class QueueDemo {

	public static void main(String[] args) {

		// Testing the Array Queue
		QueueArray<Character> queueArray = new QueueArray<>(10);

		System.out.println("Testing the Array Queue\n");
		System.out.println("The Queue is empty " + queueArray.isEmpty());
		System.out.println("The size of the Queue " + queueArray.size());
		System.out.println("Adding 'A' ");
		queueArray.enqueue('A');
		System.out.println("Adding 'B' ");
		queueArray.enqueue('B');
		System.out.println("Adding 'C' ");
		queueArray.enqueue('C');
		System.out.println("Adding 'D' ");
		queueArray.enqueue('D');
		System.out.println("Popping element from the queue: " + queueArray.dequeue() + " is popped");
		System.out.println("Popping element from the queue: " + queueArray.dequeue() + " is popped");
		queueArray.printQueue(); // Shoulg print A, B
		System.out.println("The size of the queue " + queueArray.size());

		// Testing the Linked list Queue
		QueueLinkedList<Character> queueLinkedList = new QueueLinkedList<>();
		System.out.println("\nTesting the Linked list queue\n");
		System.out.println("The queue is empty " + queueLinkedList.isEmpty());
		System.out.println("The size of the queue " + queueLinkedList.size());
		System.out.println("Adding 'A' ");
		queueLinkedList.enqueue('A');
		System.out.println("Adding 'B' ");
		queueLinkedList.enqueue('B');
		System.out.println("Adding 'C' ");
		queueLinkedList.enqueue('C');
		System.out.println("Adding 'D' ");
		queueLinkedList.enqueue('D');
		System.out.println("Popping element from the queue: " + queueLinkedList.dequeue() + " is popped");
		System.out.println("Popping element from the queue: " + queueLinkedList.dequeue() + " is popped");
		queueLinkedList.printQueue(); // Shoulg print A, B
		System.out.println("\nThe size of the queue " + queueLinkedList.size());

	}

}
