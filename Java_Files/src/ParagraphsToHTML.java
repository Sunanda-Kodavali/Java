import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class ParagraphsToHTML {
    public static void main(String[] args) throws URISyntaxException, IOException {

        URL url= ParagraphsToHTML.class.getResource("sample.txt");

        File file=new File(url.toURI());
        Scanner scanner=new Scanner(file);

        String userHome = System.getProperty("user.home");
        String desktopPath = userHome + "/Desktop";
        String fileName = "/testHTML.txt";
        PrintWriter printWriter = new PrintWriter(new FileWriter(desktopPath+fileName, true));

        while (scanner.hasNextLine())
        {
            String s = scanner.nextLine();
            printWriter.println("<p>"+s+"</p>");
        }
    }
}
