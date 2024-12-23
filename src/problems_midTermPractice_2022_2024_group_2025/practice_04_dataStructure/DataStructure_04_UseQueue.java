package problems_midTermPractice_2022_2024_group_2025.practice_04_dataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DataStructure_04_UseQueue {
	/*
	 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
	 * Use For Each loop and while loop with Iterator to retrieve data.
	 *
	 */
	public static void main(String[] args) {

		// Create a Queue using LinkedList
		Queue<Integer> queue = new LinkedList<>();

		// Add elements to the queue
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);

		// Peek at the front element of the queue (does not remove it)
		System.out.println("Peek: " + queue.peek());

		// Remove elements from the queue
		System.out.println("Removed: " + queue.remove()); // removes 10
		System.out.println("Removed: " + queue.remove()); // removes 20
		System.out.println("Removed: " + queue.remove()); // removes 30

		// Poll elements from the queue (removes and returns the front element, or null if empty)
		System.out.println("Polled: " + queue.poll()); // removes 30
		System.out.println("uuuuuuuuuuuuuu"+queue);

		// Add more elements to the queue
		queue.add(50);
		queue.add(60);

		// Using for-each loop to retrieve data
		System.out.println("Elements in queue using for-each loop:");
		for (Integer element : queue) {
			System.out.println(element);
		}

		// Using while loop with Iterator to retrieve data [MSI : NEXT]
		System.out.println("Elements in queue using while loop with Iterator:");
		Iterator<Integer> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

