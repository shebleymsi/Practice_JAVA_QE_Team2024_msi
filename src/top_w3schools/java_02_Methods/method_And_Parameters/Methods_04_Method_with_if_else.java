package top_w3schools.java_02_Methods.method_And_Parameters;

public class Methods_04_Method_with_if_else {

    static void checkAge(int age){
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(22);

    }
}
//Inside a method, what does a parameter act as? Ans: A variable