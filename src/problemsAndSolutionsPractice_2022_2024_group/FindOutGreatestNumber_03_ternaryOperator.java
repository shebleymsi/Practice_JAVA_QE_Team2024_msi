package problemsAndSolutionsPractice_2022_2024_group;

public class FindOutGreatestNumber_03_ternaryOperator {

    public static void main(String[] args) {

        int num1 = 32, num2 = 22, num3 = 12;

        // variable = (condition) ? expressionTrue :  expressionFalse;
         int largest = (num1 >= num2) ? (num1 >= num3 ? num1 : num3) : (num2 >= num3 ? num2 : num3);

        System.out.println(largest + " is the largest number");

    }


}
