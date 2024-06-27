package RakibProblemsPractice.Array05;

public class ArrayBasicsW3School_01 { //done


    public static void main(String[] args) {

        //======================================================================
        // One-dimensional Arrays --> 1D Array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        //======================================================================
        // Change an array element by index number
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);

        //======================================================================
        // print an array to print the array elements using for loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        //======================================================================
        // print an array using for each loop
        for (String i : cars) {
            System.out.println(i);
        }

        //======================================================================
        //**********************************************************************
        // Multi-dimensional Arrays --> 2D Array
        int[][] myNumbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        System.out.println(myNumbers[1][2]); // Outputs 7

        //**********************************************************************
        // change a value of multi-dimensional array
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        //**********************************************************************
        // print a Multi-Dimensional Array use for loop
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        //**********************************************************************
        // print a multidimensional 2D array using for-each loop
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }

        //**********************************************************************
        // Knowledge purpose only 3D Array
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Multi-dimensional Arrays --> 3D Array
        int[][][] my3DNumbers = {
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}, {10, 11, 12}},
                {{13, 14, 15}, {16, 17, 18}}
        };
        System.out.println(my3DNumbers[1][0][2]); // Outputs 9

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Change a value of multi-dimensional array
        my3DNumbers[1][0][2] = 25;
        System.out.println(my3DNumbers[1][0][2]); // Outputs 25

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Print a Multi-Dimensional Array using nested for loops
        for (int i = 0; i < my3DNumbers.length; ++i) {
            for (int j = 0; j < my3DNumbers[i].length; ++j) {
                for (int k = 0; k < my3DNumbers[i][j].length; ++k) {
                    System.out.println(my3DNumbers[i][j][k]);
                }
            }
        }

        //**********************************************************************
        // Print a Multi-dimensional 3D array using for-each loop
        for (int[][] matrix : my3DNumbers) {
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.println(element);
                }
            }
        }


        /*
        // see how boolean array looks like before assing data
            boolean[] yes = new boolean[3];

        System.out.println("boolean empty array" + Arrays.toString(yes));

// see how String array looks like before assinging data.
    String[] var = new String[3];

        System.out.println("empyty var" + Arrays.toString(var));

    var[0] = "dr";
    var[1] = "rr";
    var [2] = "to";
        System.out.println("full var" +Arrays.toString(var));

        // change or update a string value of an array to null state/ primary stage.
    var[1] = "null";
        System.out.println("full var" +Arrays.toString(var));
         */
    }
}


