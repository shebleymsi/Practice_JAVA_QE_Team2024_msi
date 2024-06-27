package MidTerm.stringproblems;


import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        checkAnagram("CAT","ACT");
    }

    public static String checkAnagram(String word, String word2) {

        boolean status = true;
        if (word.length()!=word2.length()){
            status=false;
        }else {
            char[] array=word.toLowerCase().toCharArray();
            char[] array2=word.toLowerCase().toCharArray();
            Arrays.sort(array);
            Arrays.sort(array2);
            Arrays.equals(array,array2);

        }if (status== true){
            System.out.println(word +" and "+word2+" are Anagram");
        }else {
            System.out.println(word +" and "+word2+" are not Anagram");
        }
        return word;
    }


}
