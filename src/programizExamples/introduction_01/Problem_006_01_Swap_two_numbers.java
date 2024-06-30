package programizExamples.introduction_01;

public class Problem_006_01_Swap_two_numbers {
    //Example 1: Swap two numbers using temporary(temp) variable [ A N M BAZLURR RAHMAN ]

    public static void main(String[] args) {
        temporarySwap();
    }

    public static void temporarySwap() {
        int a = 5, b = 10;

        int temp = a;


        a=b; // b stored in a, so a = 10
        System.out.println("============"+a);
        System.out.println("++++++++++++"+b);

        b = temp; // [temp is assigned to b] or [ temp is stored in b ]

        System.out.println("a is : "+ a);
        System.out.println("b is : "+ b);

    }


}
