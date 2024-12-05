package w3schools.java_How_To;

import java.util.HashMap;

public class How_To_10_Loop_Through_HashMap_keySet {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
    }
}

//Note: Use the keySet() method if you only want the keys,
//Note: use the values() method if you only want the values.