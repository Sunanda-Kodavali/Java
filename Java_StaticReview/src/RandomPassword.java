import java.util.Random;

public class RandomPassword {
    private String password;
    private int length = 10;
    private String sourceLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghiklmnopqrstuvwxyz0123456789-_!$@";
    private final Random random = new Random();

    public RandomPassword() {
        generatePassword();
    }

    public RandomPassword(int length) {
        this.length = length;
        generatePassword();
    }

    public RandomPassword(int length, String sourceLetters) {
        this.length = length;
        this.sourceLetters = sourceLetters;
        generatePassword();
    }

    public String getPassword() {
        return password;
    }

    private void generatePassword() {
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(0, sourceLetters.length());
            passwordBuilder.append(sourceLetters.charAt(randomIndex));
        }
        password = passwordBuilder.toString();
    }

    @Override
    public String toString() {
        return getPassword();
    }
}