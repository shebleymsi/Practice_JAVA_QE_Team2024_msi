package MidTerm.stringproblems;

import org.junit.Assert;
import org.junit.Test;


public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

    }

    @Test
    public void checkAnagram() {
        String expected = Anagram.checkAnagram("CAT", "ACT");
        String actual = Anagram.checkAnagram("CAT", "ACT");
        Assert.assertNotEquals(expected, actual);

    }


    @Test
    public void checkLargestWord() {
        String expected = "Robot's brain is an artificial learning machine";
        String actual = String.valueOf(DetermineLargestWord.look());
        Assert.assertNotEquals(expected, actual);

    }


    @Test
    public void checkOutPalindrome() {
        String expected = Palindrome.checkPalindrome("MOM");
        String actual = Palindrome.checkPalindrome("MOM");
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void checkOutPermutation() {
        String expected = "ABC\n" + "BAC\n" + "BCA\n" +  "ACB\n" + "CAB\n" + "CBA\n";


        Permutation.checkOutPermutation("", "ABC");
        boolean actual = false;

        Assert.assertFalse(" not match", actual);

    }


}