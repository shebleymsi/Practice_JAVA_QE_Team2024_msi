package learnJavaQEWinter2022.RakibProblemsPractice.ArrayList06;
import java.util.ArrayList;
public class EmptyOrNot_04 {

        public static void main(String[] args) {
            ArrayList<Character> letters = new ArrayList<>();
            System.out.println("Is ArrayList empty? " + letters.isEmpty()); // Should print true

            letters.add('A');
            System.out.println("Is ArrayList empty? " + letters.isEmpty()); // Should print false
        }
    }

