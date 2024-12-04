package w3schools.java_01_Tutorial;

public class Tutorial_20_Array_length {
    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        cars[0] = "Opel";
        System.out.println(cars[0]);

        System.out.println(cars.length);
    }
}
// You can access an array element by referring to the index number.
// Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

//Array Length: To find out how many elements an array has, use the length property: