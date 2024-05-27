import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Task1_NumberOfSentences {

//    How many sentences are in the file?

    public static void main(String[] args) throws URISyntaxException, FileNotFoundException {

        URL url= Task1_NumberOfSentences.class.getResource("sample.txt");
        File file=new File(url.toURI());

        Scanner scanner=new Scanner(file);
        scanner.useDelimiter("\\Z");
        String inputTxt = scanner.next();
        scanner.close();

        String[] sentences = getAllSentences(inputTxt);
        System.out.println("No of Sentences: "+sentences.length);
    }

    private static String[] getAllSentences(String inputTxt) {
        return inputTxt.split("\\.");
    }


}
