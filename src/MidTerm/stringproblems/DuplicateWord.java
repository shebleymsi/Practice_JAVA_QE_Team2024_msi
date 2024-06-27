package MidTerm.stringproblems;

import java.util.Map;
import java.util.TreeMap;
public class DuplicateWord {

    /*
     * Write a java program to find the duplicate words and their number of occurrences in the string.
     * also Find the average length of the words.
     */
    //String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

    static void count_freq(String st) {
        Map<String, Integer> mp = new TreeMap<>();
        // convert String to Array using Regular Expression
        String[] arr = st.split("\\s+");

        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


    static final int OUT = 0;
    static final int IN = 1;

    // returns number of words in str
    static int countWords(String str)
    {
        int state = OUT;
        int wc = 0;  // word count
        int i = 0;

        // Scan all characters one by one
        while (i < str.length())
        {
            // If next character is a separator, set the
            // state as OUT
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n'
                    || str.charAt(i) == '\t')
                state = OUT;


                // If next character is not a word separator
                // and state is OUT, then set the state as IN
                // and increment word count
            else if (state == OUT)
            {
                state = IN;
                ++wc;
            }

            // Move to next character
            ++i;
        }
        return wc;
    }

    public static void main(String[] args) {

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        count_freq(st);

        int count = 0;
        //Counts each character except space
        for(int i = 0; i < st.length(); i++) {
            if(st.charAt(i) != ' ')
                count++;
        }


        //Displays the total number of characters present in the given string
        System.out.println("Total number of characters in this string : " + count);


        System.out.println("Total Number of words in this string : " + countWords(st));

        int num_chars = count;
        int num_words = countWords(st);
        double avg_length = (double)num_chars / num_words;
        System.out.printf("The average word length is %.2f characters.\n", avg_length);


    }



}
