package programizExamplesPractice_2024_RUNNING.examples_01_Introduction;



public class Problem_005_Compute_Remainder {
    // Example: Compute Quotient and Remainder
    // dividend(ভাজ্য/লভ্যাংশ); divisor(ভাজক); quotient(ভাগফল); remainder(ভাগশেষ/অবশিষ্ট);
    public static void main(String[] args) {

        int dividend = 25, divisor = 4;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

    }
}
