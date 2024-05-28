import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Excercise2_ContentsofDesktop {
    public static void main(String[] args) throws IOException {

        String userHome = System.getProperty("user.home");
        String desktopPath = userHome + "/Desktop";

        Path p = Path.of(desktopPath);

        Stream<Path> stream= Files.list(p);

        System.out.println(stream.toList());
    }
}
