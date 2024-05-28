import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2_Paragraphs {

    public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
        URL url= Task1_NumberOfSentences.class.getResource("sample.txt");
        File file=new File(url.toURI());

        Scanner sc=new Scanner(file);
       List<String> sentences = new ArrayList<>();
       List<List<String>> paragraphs = new ArrayList<>();

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if(s.contains(".")){
                String[] strings = s.split("\\.");
                sentences.addAll(List.of(strings));
                paragraphs.add(sentences);
            }

        }


        System.out.println("No of Sentences: "+sentences.size());
        System.out.println("No of Paragraphs: "+paragraphs.size());


    }
}
