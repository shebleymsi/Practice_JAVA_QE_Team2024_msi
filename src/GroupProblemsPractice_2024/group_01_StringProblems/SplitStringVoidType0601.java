package GroupProblemsPractice_2024.group_01_StringProblems;

import java.util.Arrays;

public class SplitStringVoidType0601 { // done

    public static void main(String[] args) {

        String str = "Hello World!";
        getSplitString(str);


    }

    // lecture start over here ++++++++++++++++++++++++++++++++++++++++

    public static void getSplitString(String str) {

        String[] splitStr;
        splitStr = str.split(" ");

        // 01
        for(int i = 0; i < splitStr.length; i ++){
            System.out.println(splitStr[i]);
        }

        // 02 ==> or
        for (String str1 : splitStr) {
            System.out.println(str1);
        }

        // 03 ==> or
        System.out.println(Arrays.toString(splitStr));


    }
}
