package w3_JAVA.java_01_Tutorial;

public class Tutorial_15_For_each_loop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Tesla"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
//There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data sets):
//for (type variableName : arrayName) { // code block to be executed}
//for (type singular : plural) { // code block to be executed}