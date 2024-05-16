package BookLibrary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book(1,"Lord of the Rings","",Category.MYSTERY));
        books.add(new Book(2,"Lord of the Wings","",Category.MYSTERY));
        books.add(new Book(3,"Anastasia","",Category.ADVENTURE));
        books.add(new Book(4,"Harry Potter","",Category.MYSTERY));

        List<Character> res =  books.stream().map(book -> Character.toUpperCase(book.title().charAt(0))).distinct().sorted(Comparator.naturalOrder()).toList();

        System.out.println(res);
    }
}
