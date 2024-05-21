package learnJavaQEWinter2022.RakibProblems.Array06;

public class ArrayBasicsW3School {


    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        // Change an array element
        cars[0] = "Opel";
        System.out.println(cars[0]);

        System.out.println(cars.length);

        // Loop through an array to print the array elements using for loop

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // loop through an array using for each loop

        for (String i : cars) {
            System.out.println(i);
        }

        // Multidimensional Arrays

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7


        // change a value of multi dimemensional array
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);


       // Loop Through a Multi-Dimensional Array
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        // Loop through a multi-dimensional array using for each loop
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}


