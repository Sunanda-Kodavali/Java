import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Guess the number");
            int guess = sc.nextInt();
            int ran = random.nextInt(100);
            System.out.println(ran);
            if(guess > ran){
                System.out.println("your number is large");
            }else{
                System.out.println("your number is small");
            }
        }
    }
}
