package problemsAndSolutionsPractice_2022_2024_group;

public class ConvertStringToInteger {

    public static void main(String[] args) {

        // Convert String to int // key way: Str to Int ==> parseInt()
        String st = "12345";
        int num = Integer.parseInt(st);
        System.out.println(num);

        // try to proof that output is number
        System.out.println("number: " +num*2);


        // Convert Int to String // key way: Int to Str ==> valueOf()
        int age = 34;
        String age1 = String.valueOf(age);
        System.out.println(age1);

        // try to proof that output is String
        System.out.println("age1: " + 34);

        // valueOf() ==> Returns the string representation of the specified value
        // toString() ==> Returns the value of an object(such as: Array, String) as a String

        /* int alphabet = 'a'; // How to print ascii value of a character:
        System.out.println(alphabet);*/

    }


}
