package top_w3schools.java_02_Methods.method_And_Parameters;

public class Methods_05_SingleParameter_return_Method {
    static int myMethod(int x ){
        return x+ 5;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(20));
    }

}

//If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void,
// and use the return keyword inside the method.