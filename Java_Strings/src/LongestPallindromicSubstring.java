import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestPallindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            for (int j = i+1; j <= s.length() ; j++) {
                String subStr = s.substring(i,j);
                String revStr = reverseString(subStr);
                if(subStr.equalsIgnoreCase(revStr)){
                    map.put(subStr,subStr.length());
                }
            }
        }
        int maxValueInMap = Collections.max(map.values());

        // Iterate through HashMap
        for (Map.Entry<String, Integer> entry :
                map.entrySet()) {

            if (entry.getValue() == maxValueInMap) {

                System.out.println(entry.getKey());
            }
        }
    }

    private static String reverseString(String subStr) {
        String revStr = "";
        for (int i = subStr.length()-1; i >= 0; i--) {
            revStr+= subStr.charAt(i);
        }
        return revStr;
    }
}
