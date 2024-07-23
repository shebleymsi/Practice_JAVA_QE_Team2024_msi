package group_ProblemsPractice_RU_2024.group_06_ArrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyOfEachElement_10 {

    // Write a Java program to find the frequency of each element in an ArrayList.

        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1); // 0
            numbers.add(2); // 1
            numbers.add(1); // 2
            numbers.add(3); // 3
            numbers.add(2); // 4
            numbers.add(1); // 5
            numbers.add(3); // 6

            HashMap<Integer, Integer> frequencyMap = new HashMap<>();

            for (int i = 0; i < numbers.size(); i++) {
                frequencyMap.put(numbers.get(i), frequencyMap.getOrDefault(numbers.get(i),0)+ 1);
            }

//            for (int num : numbers) {
//                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//            }

            System.out.println("Frequency of each element: " + frequencyMap);
        }
    }


