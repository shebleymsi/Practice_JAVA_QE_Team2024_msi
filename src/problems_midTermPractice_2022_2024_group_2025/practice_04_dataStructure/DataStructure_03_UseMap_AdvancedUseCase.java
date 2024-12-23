package problems_midTermPractice_2022_2024_group_2025.practice_04_dataStructure;

import java.util.*;

public class DataStructure_03_UseMap_AdvancedUseCase {

	/* msi
	 * Demonstrate how to use Map that includes add,peek,remove,pool elements.
	 * Add List<String> into a Map. Like:
	  Map<String, List<string>> list = new HashMap<String, List<String>>();
	 * Use For Each loop and while loop with Iterator to retrieve data.

	 */

	/* midterm
	 * Demonstrate how to use Map that includes storing and retrieving elements.
	 * Add List<String> into a Map. Like:
	  Map<String, List<string>> list = new HashMap<String, List<String>>();

	 * Use For Each loop and while loop with Iterator to retrieve data.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data. [ NEXT: chatGPT ]
	 *
	 */

	public static void main(String[] args) {

		// Create a Map with String keys and List<String> values
		Map<String, List<String>> map = new HashMap<>();

		// Add List<String> to the map
		List<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Cherry");

		List<String> list2 = new ArrayList<>();
		list2.add("Dog");
		list2.add("Elephant");
		list2.add("Frog");

		map.put("Fruits", list1);
		map.put("Animals", list2);

		System.out.println("++++++++++++++++"+map);

		// Peek at the value associated with a key (does not remove it)
		System.out.println("Peek at 'Fruits': " + map.get("Fruits"));

		// Remove an entry from the map
		List<String> removedList = map.remove("Animals");
		System.out.println("Removed 'Animals': " + removedList);
		//System.out.println("------------------"+map);

		// Add another entry to the map
		List<String> list3 = new ArrayList<>();
		list3.add("Xylophone");
		list3.add("Yarn");
		list3.add("Zebra");

		map.put("Objects", list3);

		// Using for-each loop to retrieve data
		System.out.println("Entries in map using for-each loop:");
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}


		// Using while loop with Iterator to retrieve data // [MSI : NEXT]
		System.out.println("Entries in map using while loop with Iterator:");
		Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, List<String>> entry = iterator.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}

}

