package w3schools.java_02_Methods.methods_04_recursion;

public class Recursion_02_SumAllNumbersBetween_5_to_10 {

    public static void main(String[] args) {
        int x = sum(5, 10);
        System.out.println(x);
    }

    public static int sum(int start, int end) {

        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }

    }

}

//Halting Condition
