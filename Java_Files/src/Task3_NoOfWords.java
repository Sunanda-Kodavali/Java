import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3_NoOfWords {
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        URL url= Task1_NumberOfSentences.class.getResource("sample.txt");
        File file=new File(url.toURI());
        int count = 0, maxCount = 0;
        String word = "";
        Scanner scanner=new Scanner(file);

        List<String> wordsList = new ArrayList<>();
        while (scanner.hasNext()){
            wordsList.add(scanner.next());
        }
        System.out.println(wordsList.size());


        for(int i = 0; i < wordsList.size(); i++){
            count = 1;

            for(int j = i+1; j < wordsList.size(); j++){
                if(wordsList.get(i).equals(wordsList.get(j))){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                word = wordsList.get(i);
            }
        }

        System.out.println("Most repeated word: " + word);
    }
}
