package xqe_JavaMathNotebook_2025.xw3school_java_How_To;

import java.util.ArrayList;

public class How_To_9_Loop_Through_an_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (String i : cars){
            System.out.println(i);
        }
    }
}
