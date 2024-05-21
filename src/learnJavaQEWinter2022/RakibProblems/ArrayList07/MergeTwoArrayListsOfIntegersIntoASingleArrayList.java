package learnJavaQEWinter2022.RakibProblems.ArrayList07;

import java.util.ArrayList;

public class MergeTwoArrayListsOfIntegersIntoASingleArrayList {

    public static void main(String[] args) {
        // Write a Java program to merge two ArrayLists of integers into a single ArrayList
        // Input: [1, 2, 3, 4, 5] and [6, 7, 8, 9, 10]
        // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

                ArrayList<Integer> list1 = new ArrayList<>();
                list1.add(1);
                list1.add(2);
                list1.add(3);
                list1.add(4);
                list1.add(5);

                ArrayList<Integer> list2 = new ArrayList<>();
                list2.add(3);
                list2.add(4);
                list2.add(5);
                list2.add(6);
                list2.add(7);


                ArrayList<Integer> mergedList = new ArrayList<>();
                mergedList.addAll(list1);
                mergedList.addAll(list2);

                System.out.println("Merged ArrayList: " + mergedList);

                //remove duplicates
                ArrayList<Integer> uniqueMergedList = new ArrayList<>(mergedList);
                System.out.println("Merged ArrayList after removing duplicates: " + uniqueMergedList);

            }
        }

