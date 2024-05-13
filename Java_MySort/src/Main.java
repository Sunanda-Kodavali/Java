import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Z HGTTG", "Douglas Adams", 200));
        books.add(new Book("A RATEOTU", "Douglas Adams", 220));
        books.add(new Book("C LOTR", "Tolkien", 420));
        books.add(new Book("X The Hobbit", "Tolkien", 220));

        System.out.println(books);

//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getNumberOfPages() - o2.getNumberOfPages();
//            }
//        });

//        MySort.sort(books, new MySortComparator() {
//            @Override
//            public boolean youTellMe(Book o1, Book o2) {
//                return o1.getTitle().compareTo(o2.getTitle()) < 0;
//            }
//        });

        // Create a new method called `filter`
        // this method has the following arguments
        // a list of Books, and an object that implements the Interface MyFilterer
        // the MyFilterer Interface only has 1 method called `include`
        // boolean include(Book book);
        // if include is true the book should pass the filter
        // if include is false the book should not be in the List anymore

        MySort.filter(books, new MyFilterer() {
            @Override
            public boolean include(Book book) {
                return book.getNumberOfPages() >= 210;
            }
        });


        System.out.println(books);
    }
}