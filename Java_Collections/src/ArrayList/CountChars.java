package ArrayList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write something:");
        String str = scanner.nextLine();
        System.out.println("The number of characters: "+str.length());
        Set<Character> set = new HashSet<>();
        char[] ch = str.toCharArray();
        for(char c : ch){
            set.add(c);
        }
        System.out.println("The number of unique characters: "+set.size());
    }
}
