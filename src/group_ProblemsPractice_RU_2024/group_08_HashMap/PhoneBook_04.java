package group_ProblemsPractice_RU_2024.group_08_HashMap;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook_04 {

        public static void main(String[] args) {

            Map<String, String> phoneBook = new HashMap<>();

            phoneBook.put("Alice", "123-456-7890");
            phoneBook.put("Bob", "456-789-0123");
            phoneBook.put("Charlie", "789-012-3456");

            // Retrieve phone numbers of a individual key
            System.out.println("Bob's phone number: " + phoneBook.get("Bob"));

            // retrieve all phone numbers
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // retrieve a key by index
            System.out.println("Key at index 1: " + phoneBook.keySet().toArray()[1]);
            
            // change and after that a key
            phoneBook.put("Bob", "000-000-0000");
            System.out.println("Bob's phone number: " + phoneBook.get("Bob"));

            // remove a key and print
            phoneBook.remove("Bob");
            System.out.println("Bob's phone number: " + phoneBook.get("Bob"));

            System.out.println("After remove BOB:************************");
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }


