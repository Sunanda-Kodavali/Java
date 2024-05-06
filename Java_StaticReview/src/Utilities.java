import jdk.jshell.execution.Util;

import java.util.Random;

public final class Utilities {

    private Utilities() {}

    private final static Random random = new Random();

    public static String generatePassword() {
        return Utilities.generatePassword(10);
    }

    public static String generatePassword(int length) {
        String sourceLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghiklmnopqrstuvwxyz0123456789-_!$@";

        return Utilities.generatePassword(length, sourceLetters);
    }

    public static String generatePassword(int length, String sourceLetters) {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(0, sourceLetters.length());
            password.append(sourceLetters.charAt(randomIndex));
        }
        return password.toString();
    }
}