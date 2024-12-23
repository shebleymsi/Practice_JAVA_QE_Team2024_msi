package zqe_JavaMathNotebook_2025.CountWord;
import java.util.Arrays;
public class CountWord1 {

    public static void main(String[] args) {
        getCountOfTheWords();
    }

    public static void getCountOfTheWords() {
        String str = "Eid Mubarak to Everyone. Hopefully everyone fine. Thank you all, guys. oops! ";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("Total number of elements in the array: " + words.length);

    }
}
