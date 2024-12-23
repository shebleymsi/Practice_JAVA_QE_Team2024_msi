package zqe_JavaMathNotebook_2025.z_problemsAndSolutions_msi;

import java.util.*;

public class QE27_FrequencyOfWordsFromList {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>(Arrays.asList("Rakib", "Babor", "Rakib", "Shebley"));
        getFrequencyOfWords(arrayList);
    }

    public static void getFrequencyOfWords(List<String> arrayList) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < arrayList.size(); i++) {

            if (map.containsKey(arrayList.get(i))) {
                map.put(arrayList.get(i), map.get(arrayList.get(i)) + 1);
            } else {
                map.put(arrayList.get(i), 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
