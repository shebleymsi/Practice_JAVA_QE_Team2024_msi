package top_w3schools.java_02_Methods.methods_01_method_And_Parameters;

public class Methods_06_MultiParameter_Sum_return_Method {
    static int myMethod(int x, int y){
        return x+ y;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(20, 25));
    }

}

//If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void,
// and use the return keyword inside the method.