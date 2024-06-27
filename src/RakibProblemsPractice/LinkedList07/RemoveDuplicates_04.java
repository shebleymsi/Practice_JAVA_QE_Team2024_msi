package RakibProblemsPractice.LinkedList07;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveDuplicates_04 {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 1, 2, 3, 3, 4));
        System.out.println("LinkedList before removing duplicates: " + linkedList);
        System.out.println("Size of linked list: " + linkedList.size());

        // Remove consecutive duplicates
        for (int i = 0; i < linkedList.size() - 1; i++) {
            // Step 2: Check if current element equals the next element
            if (linkedList.get(i).equals(linkedList.get(i + 1))) {
                // Step 3: If true, remove the current element at index 'i'
                linkedList.remove(i);
                // Step 4: Decrement 'i' to recheck from the current position
                i--;
            }
            // Step 5: If false, continue to the next index
        }

        // Print the LinkedList after removing duplicates
        System.out.println("LinkedList after removing duplicates: " + linkedList);
    }

    /*

Step	Condition	                                            Action	                                Comment

1	    for (int i = 0; i < linkedList.size() - 1; i++)	        Start loop	                            Loop from 0 to size - 2
2	    if (linkedList.get(i).equals(linkedList.get(i + 1)))    Check if current element equals next	Check for consecutive duplicates
3	    True	                                                linkedList.remove(i)	                Remove the current element at index i
4	    True	                                                i--	                                    Decrement i to recheck from the current position
5	    False	                                                Continue loop	                        Move to the next index without removing elements
     */
}
