package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {

    @Test
    public void testReverse() {
        StringManipulator stringManipulator = new StringManipulator();

        String word = "some test";
        String reversedWord = stringManipulator.reverse(word);

        Assertions.assertEquals("tset emos", reversedWord);

    }

    @Test
    public void testIsPalindrome() {

        StringManipulator stringManipulator = new StringManipulator();
        String word = "some test";

        boolean result = stringManipulator.isPalindrome(word);
        Assertions.assertFalse(result);

        word = "Tacocat";
        result = stringManipulator.isPalindrome(word);
        Assertions.assertTrue(result);


    }
}
