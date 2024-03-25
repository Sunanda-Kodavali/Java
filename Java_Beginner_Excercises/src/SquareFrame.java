import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line:");
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        printStar(maxLength + 4);
        for (String word : words) {
            System.out.print("* " + word);
            for (int i = 0; i < maxLength - word.length(); i++) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }
        printStar(maxLength + 4);
    }

    public static void printStar(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}