package MidTerm.stringproblems;

public class DetermineLargestWord {


//    public static void main(String[] args) {
//       /*
//         Implement to Find the length and longest word in the given sentence below.
//         Should return "10 biological".
//         */
//        String s="Human brain is a biological learning machine";
//        Map<Integer, String> wordNLength = findTheLargestWord(s);
//       //implement
//
//
//
//    }
//
//    public static Map<Integer, String> findTheLargestWord(String wordGiven){
//        Map<Integer, String> map = new HashMap<Integer, String>();
//        String st = "";
//        //implement */
//
//
//        return map;

    public static void main(String[] args) {

        System.out.println(look());

    }

    public static int look() {

        String s = "Robot's brain is an artificial learning machine";
        String[] word = s.split(" ");
        String rts = " ";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > rts.length())
                rts = word[i];
        }
        System.out.println(rts);
        return rts.length();
    }


}

