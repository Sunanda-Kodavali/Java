import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {
    public static void main(String[] args) {
        String mixed = "Itä will be 127 computers, 10  and 15 screens";

        Pattern pattern = Pattern.compile("\\d[0-9]*");
        Matcher matcher = pattern.matcher(mixed);
       while(matcher.find()){
            System.out.print(matcher.group()+" ");
        }

        System.out.println();

        Pattern patternAlphabets = Pattern.compile("[A-Za-zÀ-ÿ ]");
        Matcher matcherAlphabets = patternAlphabets.matcher(mixed);
        while(matcherAlphabets.find()){
            System.out.print(matcherAlphabets.group());
        }
    }
}
