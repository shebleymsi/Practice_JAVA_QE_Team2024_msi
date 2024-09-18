package programizExamplesPractice_2024_RUNNING.examples_02_TypeConversion;


public class Problem_003_01 {
        //Example 2: int to char by using forDigit()
        // chatGpt: what is radix in java? [search]
        public static void main(String[] args) {


                // create int variables
                int num1 = 1;
                int num2 = 13;

                // convert int to char
                // for value between 0-9
                char a = Character.forDigit(num1, 10);

                // for value between 0-9
                char b = Character.forDigit(num2, 16);

                // print value
                System.out.println(a);    // 1
                System.out.println(b);    // d
        }


}
