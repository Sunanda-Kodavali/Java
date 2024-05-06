import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String password = Utilities.generatePassword(20, "01");
        System.out.println(password);

        RandomPassword pass1 = new RandomPassword();
        RandomPassword pass2 = new RandomPassword(5);
        RandomPassword pass3 = new RandomPassword(15, "XYZ");

        System.out.println(pass1);
        System.out.println(pass2);
        System.out.println(pass3);

    }

    // public static String generatePassword() {
    // public static String generatePassword(int length) {
    // public static String generatePassword(int length, String sourceLetters) {
}