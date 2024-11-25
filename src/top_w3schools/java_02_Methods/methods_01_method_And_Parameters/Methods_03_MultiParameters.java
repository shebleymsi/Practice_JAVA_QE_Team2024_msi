package top_w3schools.java_02_Methods.methods_01_method_And_Parameters;

public class Methods_03_MultiParameters {

    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }


    public static void main(String[] args) {
        myMethod("Liam", 25);
        myMethod("Jenny", 26);
        myMethod("Anjoman", 27);

    }

}
//When a parameter is passed to the method, it is called an argument.
// So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.