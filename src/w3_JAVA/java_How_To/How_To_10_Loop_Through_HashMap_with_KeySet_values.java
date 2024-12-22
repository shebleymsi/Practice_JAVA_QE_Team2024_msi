package w3_JAVA.java_How_To;

import java.util.HashMap;

public class How_To_10_Loop_Through_HashMap_with_KeySet_values {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        for (String i : capitalCities.keySet()) {
            System.out.println(i + " : " + capitalCities.get(i));
        }
    }
}

//Note: Use the keySet() method if you only want the keys,
