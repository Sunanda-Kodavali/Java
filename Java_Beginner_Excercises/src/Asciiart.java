import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Asciiart {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Ascii.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            String res = sc.nextLine();
            System.out.println(res);
        }
    }
}
