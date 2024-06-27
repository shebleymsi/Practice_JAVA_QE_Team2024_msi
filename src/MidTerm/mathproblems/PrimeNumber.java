package MidTerm.mathproblems;

public class PrimeNumber {

    /*
     * Find list of Prime numbers from number 2 to 1 million.
     * Try the best solution as possible.Which will take less CPU life cycle.
     * Out put number of Prime numbers on the given range.
     *
     *
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     *
     */

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;

        return true;
    }

    // Function to print primes
    static int printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) System.out.print(i + ",");

        }

        return n;
    }

    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the value of n :  ");
//        int n = scanner.nextInt();
//        scanner.close();


        int n = 10; // n = 1000000
        printPrime(n);
    }

}
