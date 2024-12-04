package w3schools.java_01_Tutorial;

public class Tutorial_09_Short_Hand_if_else_ternary_operator {
    public static void main(String[] args) {
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
// variable = (condition) ? expressionTrue :  expressionFalse;
//There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
