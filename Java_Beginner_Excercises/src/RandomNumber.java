import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        
        int num = myRandomNumber(5, 10);
        System.out.println(num);
    }

    private static int myRandomNumber(int min, int max) {
        Random random = new Random();
        return  min + random.nextInt(max - min + 1);
    }
}
