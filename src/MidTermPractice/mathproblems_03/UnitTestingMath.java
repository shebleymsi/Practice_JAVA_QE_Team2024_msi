package MidTermPractice.mathproblems_03;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestingMath {

    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

    }


    @Test
    public void isPrime1() {
        int expected = 10;
        int n = 10;
        int actual = PrimeNumber.printPrime(n);
        Assert.assertEquals(expected, actual);

    }

    @Test

    public void isPattern() {
        int expected = Pattern.num(100);
        int actual = Pattern.num(100);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void mergeArray() {
        int expected = MergeTwoArraysAndRemoveDuplicatesProgram.mergeArray();
        int actual = MergeTwoArraysAndRemoveDuplicatesProgram.mergeArray();
        Assert.assertEquals(expected, actual);
    }



}
