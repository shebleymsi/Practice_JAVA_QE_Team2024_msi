package QA_InterviewCode_Capital_One_Bank_Old_2021_Monirul_2024.string;

public class Penultimate_Word {
    public static void main(String[] args) {
        String st ="monirul islam";
        String[] words = st.split("[ ]");

        System.out.println(words[words.length-1]);
        System.out.println(words[words.length-2]);
    }
}
