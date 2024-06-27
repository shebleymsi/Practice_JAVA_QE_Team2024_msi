package RakibProblemsPractice.Loop04;

public class CountNumbersByWhile04 { //done


        public static void main(String[] args) {

            //01.
            for(int count = 1; count <= 10; count++){
                System.out.print(count);
            }

            //02.
            System.out.println(); // Adding a new line for better readability of output
            int count = 1;
            while (count <= 10) {
                System.out.print(count);
                count++;
            }

            //03. for each loop we need to create an array 1st
            System.out.println(); // Adding a new line for better readability of output
            int[] countArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for(int c : countArray){
                System.out.print(c);
            }


        }
    }
