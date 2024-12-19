package org.example;

public class StringManipulator {

    public String reverse(String input) {

        return new StringBuilder(input).reverse().toString();

    }

    public boolean isPalindrome(String input) {
        return input.equalsIgnoreCase(reverse(input));
    }
}
