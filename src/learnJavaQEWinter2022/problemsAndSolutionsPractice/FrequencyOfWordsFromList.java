package learnJavaQEWinter2022.problemsAndSolutionsPractice;

import java.util.*;

public class FrequencyOfWordsFromList {
    public static void main(String[] args) { // plz find classname: FindOutFrequencyOfWordFromAString

        List<String> arrayList = new ArrayList<>(Arrays.asList("Rakib", "Babor", "Rakib", "Shebley"));
        getFrequencyOfWords(arrayList);
    }

    public static void getFrequencyOfWords(List<String> arrayList) {
        TreeMap<String, Integer> map = new TreeMap<>();

        // To Add value in map
        for (int i = 0; i < arrayList.size(); i++) {

            if (map.containsKey(arrayList.get(i))) {
                // If present, incrementing its frequency by 1
                map.put(arrayList.get(i), map.get(arrayList.get(i)) + 1);
            } else {
                // If not present, adding the word to the map with frequency 1
                map.put(arrayList.get(i), 1);
            }
        }
        // Displaying the frequency of each String(Name)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
