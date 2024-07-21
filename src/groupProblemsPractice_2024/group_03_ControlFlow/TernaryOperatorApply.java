package groupProblemsPractice_2024.group_03_ControlFlow;

public class TernaryOperatorApply { //done
    public static void main(String[] args) {
        getDecisionString();
        getDecisionInt();
        getDecisionTernary();
    }

    public static void getDecisionString() {
        int a = 5;
        int b = 6;
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
    }

    public static void getDecisionInt() {
        int a = 5;
        int b = 6;
        if (a > b) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }


    public static void getDecisionTernary() {
        int a = 5;
        int b = 6;
        System.out.println( "getDecisionTernary: " + ((a > b) ? 2:3 ));

    }

}
