import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class FileReadWays {


    public static void main(String[] args) throws URISyntaxException, FileNotFoundException {


//        Solution 1:

        Path path = Path.of(Objects.requireNonNull(FileReadWays.class.getResource("sample.txt")).toURI());
        try {
            List<String> lines = Files.readAllLines(path);
            System.out.println(lines);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


//        Solution 2:

        try {
            FileReader fr = new FileReader(Path.of(Objects.requireNonNull(FileReadWays.class.getResource("sample.txt")).toURI()).toString());
            BufferedReader br =new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        Solution 3:

        URL url= Task1_NumberOfSentences.class.getResource("sample.txt");
        File file=new File(url.toURI());

        Scanner scanner=new Scanner(file);
        scanner.useDelimiter("&& ");
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            String next = scanner.next();
            words.add(next);
        }
        scanner.close();
        System.out.println(words);

        //    Solution 4:

        try (
                FileInputStream fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr)
        )
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }



}
