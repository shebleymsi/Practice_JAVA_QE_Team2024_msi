package top_w3schools.java_02_Methods.method_And_Parameters;

public class Methods_06_MultiParameter_Sum_return_Method_1 {
    static int myMethod(int x, int y){
        return x+ y;
    }

    public static void main(String[] args) {
        int z = myMethod(20, 25);
        System.out.println(z);
    }

}

//store the result in a variable (recommended, as it is easier to read and maintain):
