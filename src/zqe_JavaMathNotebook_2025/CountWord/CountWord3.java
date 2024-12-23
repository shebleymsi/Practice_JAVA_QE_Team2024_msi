package zqe_JavaMathNotebook_2025.CountWord;

public class CountWord3 {

    public static void main(String[] args) {

        getCountOfTheWords();
    }

    public static void getCountOfTheWords() {
        String str = "Eid Mubarak to Everyone. Hopefully everyone fine. Thank you all, guys. oops! ";
        String[] words = str.split(" ");
        int count1 = 0;
        for (String word : words) {
            if (word.trim().length() != 0) {
                count1 = count1 + 1; // Increment count for non-empty words
            }
        }
        System.out.println("Number of words in String is: " + count1);
    }
}
