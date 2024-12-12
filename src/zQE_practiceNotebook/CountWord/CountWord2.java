package zQE_practiceNotebook.CountWord;

public class CountWord2 {

    public static void main(String[] args) {
        getCountOfTheWords();
    }

    public static void getCountOfTheWords() {
        String str = "Eid Mubarak to Everyone. Hopefully everyone fine. Thank you all, guys. oops! ";
        String[] words = str.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].trim().length() != 0) {
                count = count + 1;
            }
        }
        System.out.println("Number of words in String is : " + count);

    }
}


