package learnJavaQEWinter2022.RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;

public class CharRemoveFromStringByMethod_19 {  // Next ...

    public static void main(String[] args) {
        String speech = "i am Shahadul Islam";
        ArrayList<Character> x = convertStringToArrayList(speech);
        ArrayList<Character> y = removeCharacter(x, ' ');
        ArrayList<Character> z = removeCharacter(x, ' ');
        ArrayList<Character> p = removeCharacter(x, ' ');
        System.out.println(p);
        System.out.println(removeCharacter(x, 'm'));

    }

    // ================================= lecture Start ================================

    public static ArrayList<Character> convertStringToArrayList(String words) {

        ArrayList<Character> sentence = new ArrayList<>();
        for (int i = 0; i < words.length(); i++) {
            sentence.add(words.charAt(i));

        }
        return sentence;
    }

    public static ArrayList<Character> removeCharacter(ArrayList<Character> arr, char c) {
        int z = arr.indexOf(c);
        arr.remove(z);
        return arr;
    }


}

