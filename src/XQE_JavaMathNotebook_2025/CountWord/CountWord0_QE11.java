package XQE_JavaMathNotebook_2025.CountWord;

public class CountWord0_QE11 {
    public static void main(String[] args) {
        String str = "Eid Mubarak to Every one";
        int count = getCountOfTheWords(str);
        System.out.println("Number of words in String: " + count);
    }

    public static int getCountOfTheWords(String str) {
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        return count;
    }
}

// check also void type by copilot

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your String");
//        String str = input.nextLine();