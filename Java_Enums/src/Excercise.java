import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char c = 'l';

        int res = countChars(str.toLowerCase(),c);
        System.out.println(res);

        //Lamda

        long count = str.toLowerCase().chars().filter(ch -> ch == 'l').count();
        }

    private static int countChars(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c){
                count += 1;
            }
        }
        return count;
    }




}
