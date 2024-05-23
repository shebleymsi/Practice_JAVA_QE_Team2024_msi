package learnJavaQEWinter2022.RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromAnArrayListStrings {
    public static void main(String[] args) {

        // Write a Java program to remove all the duplicates from an ArrayList of Strings
        // Input: [“Java”, “Python”, “Java”, “C++”, “Python”, “C#”, “Java”]
        // Output: [“Java”, “Python”, “C++”, “C#”]

                ArrayList<String> words = new ArrayList<>();
                words.add("apple");
                words.add("banana");
                words.add("orange");
                words.add("apple");
                words.add("banana");
                ArrayList<String> uniqueWords = new ArrayList<>(new LinkedHashSet<>(words));

                System.out.println("ArrayList after removing duplicates: " + uniqueWords);
            }
        }

