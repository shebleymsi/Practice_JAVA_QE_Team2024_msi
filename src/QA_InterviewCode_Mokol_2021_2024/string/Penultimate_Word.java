package QA_InterviewCode_Mokol_2021_2024.string;

public class Penultimate_Word {
    public static void main(String[] args) {
        String st ="monirul islam";
        String[] words = st.split("[ ]");

        System.out.println(words[words.length-1]);
        System.out.println(words[words.length-2]);
    }
}
