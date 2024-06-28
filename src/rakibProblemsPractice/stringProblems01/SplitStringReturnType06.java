package rakibProblemsPractice.stringProblems01;

import java.util.Arrays;

public class SplitStringReturnType06 {

    public static void main(String[] args) { //done

        String str = "Hello World!";

        String[] splitStr;
        splitStr = splitString(str);

        // 01
        for(int i = 0; i < splitStr.length; i ++){
            System.out.println(splitStr[i]);
        }

        // 02 ==> or
        for (String s : splitStr) {
            System.out.println(s);
        }

        // 03 ==> or
        System.out.println(Arrays.toString(splitStr));
    }

    // lecture start over here ++++++++++++++++++++++++++++++++++++++++

    public static String[] splitString(String str) {
        return str.split(" ");
    }
}
