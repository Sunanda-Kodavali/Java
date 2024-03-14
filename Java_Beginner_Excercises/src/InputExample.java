import java.util.Scanner;

public class InputExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = input.nextLine();

        System.out.println("What's your age?");
        int age = input.nextInt();

        System.out.println(name + " is " + age + " years old.");

    }
}
