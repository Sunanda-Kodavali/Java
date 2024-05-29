import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Excercise1_WriteLinesinFile {
    public static void main(String[] args) {

        List<String> stringList = List.of("Apple2", "Banana2", "Cat2", "Dog2" );

        String userHome = System.getProperty("user.home");
        String desktopPath = userHome + "/Desktop";
        String fileName = "/sample.txt";

        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(desktopPath+fileName, true));
            for (String s: stringList){
                printWriter.println(s);
            }
            printWriter.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
