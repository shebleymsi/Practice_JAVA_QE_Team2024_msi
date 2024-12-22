package w3_JAVA.java_01_Tutorial;

public class Tutorial_14_Nested_loop_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "," + j+" ");
            }
        }
    }
}
//The "inner loop" will be executed one time for each iteration of the "outer loop"
//1,1 1,2 1,3 2,1 2,2 2,3
