package zqe_JavaMathNotebook_2025.problemsAndSolutions_msi;

import java.util.Map;
import java.util.TreeMap;

public class QE20_FindOutFrequencyOfWordFromAString {
    public static void main(String[] args) {
        String input = "How are you thank you";
        count_freq(input);
    }

    static void count_freq(String str) {
        String[] array = str.split("\\s+");
        TreeMap<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
