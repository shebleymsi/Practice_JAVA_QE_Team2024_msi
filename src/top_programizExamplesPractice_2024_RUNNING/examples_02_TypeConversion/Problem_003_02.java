package top_programizExamplesPractice_2024_RUNNING.examples_02_TypeConversion;


public class Problem_003_02 {
        //Example 3: int to char by adding '0'
        //Note: This is only applicable for int value 0 to 9.
        public static void main(String[] args) {

                // create int variables
                int num1 = 1;
                int num2 = 9;

                // convert int to char
                char a = (char) (num1 + '0');
                char b = (char) (num2 + '0');

                // print value
                System.out.println(a);    // 1
                System.out.println(b);    // 9
        }


}
