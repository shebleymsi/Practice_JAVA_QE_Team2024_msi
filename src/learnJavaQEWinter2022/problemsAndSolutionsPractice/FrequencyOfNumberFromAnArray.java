package learnJavaQEWinter2022.problemsAndSolutionsPractice;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfNumberFromAnArray {
    public static void main(String[] args) { // plz find classname: FindOutFrequencyOfWordFromAString

        int[] array = {10, 50, 30, 40, 10, 50};
        getFrequencyOfNumbers(array);

    }

    public static void getFrequencyOfNumbers(int[] array) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        // To Add value in map
        for (int i = 0; i < array.length; i++) {

            if (map.containsKey(array[i])) {
                // If present, incrementing its frequency by 1
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                // If not present, adding the word to the map with frequency 1
                map.put(array[i], 1);
            }
        }

        // Displaying the frequency of each number
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " times");
        }
    }
}
