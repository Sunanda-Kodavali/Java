import java.text.Collator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String secretPhrase = "roar";
        StringBuilder gamePhrase = createGamePhrase(secretPhrase);

        boolean gameOver = false;
        int lives = 6;

        while (!gameOver) {
            System.out.println("Lives: " + lives);
            System.out.println(gamePhrase);
            System.out.println("Try to guess a letter");

            String userLetter = input.nextLine();

            int foundLetterCounter = 0;
            for (int i = 0; i < secretPhrase.length(); i++) {
                if (isSameLetter(userLetter.charAt(0), secretPhrase.charAt(i))) {
                    gamePhrase.setCharAt(i, secretPhrase.charAt(i));
                    foundLetterCounter += 1;
                }
            }

            if (foundLetterCounter == 1) {
                System.out.printf("There is %d '%s' in the phrase\n", foundLetterCounter, userLetter);
            } else {
                System.out.printf("There are %d '%s's in the phrase\n", foundLetterCounter, userLetter);
            }

            if (foundLetterCounter == 0) {
                lives -=1 ;
                if (lives == 0) {
                    gameOver = true;
                }
            }

            if (secretPhrase.equals(gamePhrase.toString())) {
                gameOver = true;
            }
        }

        System.out.println("THE GAME IS OVER!");
        if (lives > 0) {
            System.out.println("CONGRATULATIONS YOU WON!");
            System.out.println("Lives left: " + lives);
            System.out.println("The word was: " + secretPhrase);
        } else {
            System.out.println("YOU SUCK YOU LOST!");
            System.out.println("you will never know the word... 😈");
        }
    }

    public static StringBuilder createGamePhrase(String secretPhrase) {
        StringBuilder gamePhrase = new StringBuilder();
        for (int i = 0; i < secretPhrase.length(); i++) {
            if (secretPhrase.charAt(i) == ' ') {
                gamePhrase.append(" ");
            } else {
                gamePhrase.append("-");
            }
        }
        return gamePhrase;
    }

    public static boolean isSameLetter(char letterA, char letterB) {
        return isSameLetter(String.valueOf(letterA), String.valueOf(letterB));
    }

    public static boolean isSameLetter(String letterA, String letterB) {
        Collator collator = Collator.getInstance();
        collator.setStrength(Collator.PRIMARY);
//        PRIMARY strength = diacritics and cases are considered the same
//        SECONDARY strength = ignores cases but not diacritics
//        TERTIARY strength = character needs to be exactly the same


        // compare will return 0 if they are the same
        int result = collator.compare(letterA, letterB);

        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }
}