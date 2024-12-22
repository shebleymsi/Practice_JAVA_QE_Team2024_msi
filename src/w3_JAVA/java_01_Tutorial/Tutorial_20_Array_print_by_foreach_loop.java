package w3_JAVA.java_01_Tutorial;

public class Tutorial_20_Array_print_by_foreach_loop {
    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String i : cars){
            System.out.println(i);
        }
    }
}

// nice:msi
// The example above can be read like this:-
// for each String element (called i - as in index) in cars, print out the value of i.
// If you compare the for loop and for-each loop, you will see that the for-each method is easier to write,
// it does not require a counter (using the length property), and it is more readable.
