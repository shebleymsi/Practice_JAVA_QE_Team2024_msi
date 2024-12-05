package w3schools.java_How_To;

import java.util.Arrays;

public class How_To_6_Sort_an_Array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
        Arrays.sort(cars);
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
//You can use the sort() method, found in java.util.Arrays, to sort an array: