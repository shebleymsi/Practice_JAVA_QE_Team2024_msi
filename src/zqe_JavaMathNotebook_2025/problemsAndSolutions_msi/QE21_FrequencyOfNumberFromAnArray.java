package zqe_JavaMathNotebook_2025.problemsAndSolutions_msi;

import java.util.Map;
import java.util.TreeMap;

public class QE21_FrequencyOfNumberFromAnArray {
    public static void main(String[] args) {
        int[] array = {10, 50, 30, 40, 10, 50};
        getFrequencyOfNumbers(array);

    }

    public static void getFrequencyOfNumbers(int[] array) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " times");
        }
    }
}
