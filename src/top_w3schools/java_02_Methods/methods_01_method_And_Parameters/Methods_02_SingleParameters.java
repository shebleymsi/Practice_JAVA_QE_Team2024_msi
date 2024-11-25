package top_w3schools.java_02_Methods.methods_01_method_And_Parameters;

public class Methods_02_SingleParameters {

    static void myMethod(String fname) {
        System.out.println(fname);
    }

    static void myMethod1(String fname) {
        System.out.println(fname+ " Refsnes");
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anjoman");

        myMethod1("Liam");
        myMethod1("Jenny");
        myMethod1("Anjoman");

    }

}
//When a parameter is passed to the method, it is called an argument.
// So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.