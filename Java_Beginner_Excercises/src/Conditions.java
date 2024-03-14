import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        // Condition Operators
        //      ==        !=         >       >=        <       <=

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Hey welcome! You are " + age + ". Have a beer!");
        } else {
            System.out.println("Hey welcome! Have a fritz!");
        }

    }
}
