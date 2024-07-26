package QA_InterviewCode_2021_2024.string;

public class CharacterCountInString {
    public static void main(String[] args) {
        String str = "Monirul islam";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '){
                count++;
        }
        }
            System.out.print(count);
        }
    }
