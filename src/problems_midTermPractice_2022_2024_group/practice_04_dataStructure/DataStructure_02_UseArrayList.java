package problems_midTermPractice_2022_2024_group.practice_04_dataStructure;

import java.util.ArrayList;
import java.util.Iterator;

public class DataStructure_02_UseArrayList {
	/*
	 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
	 * Use For Each loop and while_loop_with_Iterator to retrieve data.
	 *
	 *
	 * Store all the sorted data into one of the databases. [ NEXT: chatGPT ]
	 *
	 */
	public static void main(String[] args) {
		// Creating an ArrayList
		ArrayList<String> list = new ArrayList<>();

		// Adding elements
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		// Peeking the first element (without removing it)
		if (!list.isEmpty()) {
			System.out.println("First element: " + list.get(0));
		}

		// Removing an element
		list.remove("Banana");

		// Retrieving elements using for-each loop
		System.out.println("Elements in the list:");
		for (String fruit : list) {
			System.out.println(fruit);
		}

		// Retrieving elements using while loop with Iterator(পুনরাবৃত্তিকারী) [MSI : NEXT]
		System.out.println("Elements in the list (using Iterator):");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}

