package rakibProblems.arrayList07;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyOfEachElement {

    // Write a Java program to find the frequency of each element in an ArrayList.

        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(1);
            numbers.add(3);
            numbers.add(2);
            numbers.add(1);

            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : numbers) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            System.out.println("Frequency of each element: " + frequencyMap);
        }
    }


