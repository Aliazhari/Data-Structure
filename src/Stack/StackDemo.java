package Stack;

/**
 * @author Ali Azhari
 *
 */
public class StackDemo {

	public static void main(String[] args) {
       
		// Testing the Array Stack
		StackArray<Character> stackArray = new StackArray<>(10);
		
		System.out.println("Testing the Array Stack\n");
		System.out.println("The stack is empty " + stackArray.isEmpty());
		System.out.println("The size of the stack " + stackArray.size());
		System.out.println("Adding 'A' ");
		stackArray.push('A');
		System.out.println("Adding 'B' ");
		stackArray.push('B');
		System.out.println("Adding 'C' ");
		stackArray.push('C');
		System.out.println("Adding 'D' ");
		stackArray.push('D');
		System.out.println("Popping element from the statck: " + stackArray.pop() + " is popped");
		System.out.println("Popping element from the statck: " + stackArray.pop() + " is popped");
		stackArray.printStack(); // Shoulg print A, B
		System.out.println("The size of the stack " + stackArray.size());
		
		// Testing the Linked list Stack
		StackLinkedList<Character> stackLinkedList = new StackLinkedList<>();
		System.out.println("\nTesting the Array Stack\n");
		System.out.println("The stack is empty " + stackLinkedList.isEmpty());
		System.out.println("The size of the stack " + stackLinkedList.size());
		System.out.println("Adding 'A' ");
		stackLinkedList.push('A');
		System.out.println("Adding 'B' ");
		stackLinkedList.push('B');
		System.out.println("Adding 'C' ");
		stackLinkedList.push('C');
		System.out.println("Adding 'D' ");
		stackLinkedList.push('D');
		System.out.println("Popping element from the statck: " + stackLinkedList.pop() + " is popped");
		System.out.println("Popping element from the statck: " + stackLinkedList.pop() + " is popped");
		stackLinkedList.printStack(); // Shoulg print A, B
		System.out.println("\nThe size of the stack " + stackLinkedList.size());

	}

}
