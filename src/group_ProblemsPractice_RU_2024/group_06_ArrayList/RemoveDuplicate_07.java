package group_ProblemsPractice_RU_2024.group_06_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicate_07 { // Next ... interview question

    public static void main(String[] args) {

                // Write a Java program to remove duplicate elements from a String.
                String str = "Hello World";
                System.out.println("Original string: " + str);

                // Convert the string to an ArrayList of characters
                ArrayList<Character> charList = new ArrayList<> ();

                for (int i = 0; i < str.length(); i++) {
                    charList.add(str.charAt(i));
        }

                // Print the ArrayList
                System.out.println("old Arraylist: " + charList);

                // Remove duplicates
                for (int i = 0; i < charList.size(); i++) {
                    for (int j = i + 1; j < charList.size(); j++) {
                        if (charList.get(i).equals(charList.get(j))) {
                            charList.remove(j);
                            j--;
                        }
                    }
                }

                // Convert the ArrayList back to a string
                StringBuilder sb = new StringBuilder();
                for (Character c : charList) {
                    sb.append(c);
                }
                String newStr = sb.toString();

                // Print the new string without duplicates
                System.out.println("new: " + newStr);
            }
        }
