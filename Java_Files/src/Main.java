import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {

        Path path = Path.of(Main.class.getResource("sample.txt").toURI());
        String content = Files.readString(path);
        System.out.println(content);


//        FileWriter writer = new FileWriter("sample.txt");
//        writer.write("adding new line");
//        writer.close();

        String userHome = System.getProperty("user.home");
        String desktopPath = userHome + "/Desktop";
        String fileName = "/sample.txt";

        Path filePath = Path.of(desktopPath+fileName);
        Files.writeString(filePath, "content");

        PrintWriter pw = new PrintWriter(new FileOutputStream(
                new File("persons.txt"),
                true /* append = true */));
    }
}