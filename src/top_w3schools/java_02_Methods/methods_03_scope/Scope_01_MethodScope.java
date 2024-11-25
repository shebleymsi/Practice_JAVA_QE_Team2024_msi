package top_w3schools.java_02_Methods.methods_03_scope;

public class Scope_01_MethodScope {
    public static void main(String[] args) {

        // Code here CANNOT use x

        int x = 100;

        // Code here can use x
        System.out.println(x);
    }
}
//variables are only accessible inside the region they are created. This is called scope.
