package RakibProblems.ArrayList07;

import java.util.ArrayList;

public class ReplaceOccurrencesOfSpecificElement {

    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('a');
        characters.add('b');
        characters.add('c');
        characters.add('b');
        characters.add('d');

        java.util.Collections.replaceAll(characters, 'b', 'x');

        System.out.println("ArrayList after replacing all 'b' with 'x': " + characters);
    }
}

