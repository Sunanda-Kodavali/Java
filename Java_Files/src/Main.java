import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        URL colorsURL = Main.class.getResource("colors.txt");
        File file=new File(colorsURL.toURI());
        Scanner sc=new Scanner(file);

        List<String> colors = new ArrayList<>();

        while (sc.hasNext()){
            colors.add(sc.next());
        }
        System.out.println(colors);
    }
}