package xqe_JavaMathNotebook_2025.xw3school_java_How_To;

import java.util.HashMap;

public class How_To_10_Loop_Through_HashMap_values {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
    }
}

//Note: Use the keySet() method if you only want the keys,
//Note: use the values() method if you only want the values.