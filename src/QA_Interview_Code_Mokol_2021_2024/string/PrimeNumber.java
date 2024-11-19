package QA_Interview_Code_Mokol_2021_2024.string;
public class PrimeNumber {
    public static void main(String[] args) {
        int num =9;
        int count = 0;
        for (int i =2; i < num ; i++){
            if (num % i == 0) {
            count++;
            }
        }
        if (count==0) {
            System.out.println(num + "-- prime number.");
        } else {
            System.out.println(num + "-- not a prime number.");
        }
    }
}
//**************************************************
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Please enter a Number :");
//            int num = scan.nextInt();
//
//            boolean PrimeNum = false;
//            for(int i = 2; i <= num / 2; ++i) {
//                if (num % i == 0) {
//                    PrimeNum = true;
//                    break;
//                }
//            }
//            if (!PrimeNum) {
//                System.out.println(num + "---It is a prime number.");
//            } else {
//                System.out.println(num + "---It is not a prime number.");
//            }}}
/*      int num = 2;
        for (int i = 2; i <= num / 2; i++){
        if (num % i != 0) {
        //PrimeNum = true;
        System.out.println(num + "---It is a prime number.");
        } else {
        System.out.println(num + "---It is not a prime number.");
        }}}}*/