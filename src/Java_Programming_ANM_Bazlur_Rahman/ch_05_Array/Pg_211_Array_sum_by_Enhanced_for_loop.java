package Java_Programming_ANM_Bazlur_Rahman.ch_05_Array;

public class Pg_211_Array_sum_by_Enhanced_for_loop {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 4, 5, 6, -5, 0, 15};
        int sum = 0;
        for (int number:numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
