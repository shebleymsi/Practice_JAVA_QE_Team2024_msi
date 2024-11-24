package top_w3schools.java_01_Tutorial;

public class Tutorial_23_2D_Array {
    public static void main(String[] args) {

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); //7

        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

        myNumbers[1][2] = 19;
        System.out.println(myNumbers[1][2]); // Outputs 19 instead of 9

    }
}

//A multidimensional array is an array of arrays.
//Multidimensional arrays are useful when you want to store data as a tabular form,
// like a table with rows and columns.
//To create a two-dimensional array, add each array within its own set of curly braces:
//Remember that: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.