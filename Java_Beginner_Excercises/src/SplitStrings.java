import java.util.Scanner;

public class SplitStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] result = input.split(" ");

        for (String str:result) {
            System.out.println(str);
        }

    }
}
