package top_w3schools.java_02_Methods.methods_02_method_Overloading;

public class methodOverloadingExample {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(20, 25);
        double myNum2 = plusMethod(4.3, 6.26);

        System.out.println(myNum1);
        System.out.println(myNum2);
    }
}

//Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.
