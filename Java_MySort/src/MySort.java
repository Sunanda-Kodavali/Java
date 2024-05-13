import java.util.List;

public final class MySort {

    private MySort() {}

    public static void bookSortByAuthorNameASC(List<Book> bookList) {

        for (int i = 0; i < bookList.size() - 1; i++) {
            for (int j = 0; j < bookList.size() - 1 - i; j++) {

                Book currentBook = bookList.get(j);
                Book nextBook = bookList.get(j + 1);

                if (currentBook.getAuthor().compareTo(nextBook.getAuthor())  > 0) {
                    bookList.set(j, nextBook);
                    bookList.set(j + 1, currentBook);
                }
            }
        }
    }

    public static void sort(List<Book> bookList, MySortComparator comparator) {

        for (int i = 0; i < bookList.size() - 1; i++) {
            for (int j = 0; j < bookList.size() - 1 - i; j++) {

                Book currentBook = bookList.get(j);
                Book nextBook = bookList.get(j + 1);

                if (comparator.youTellMe(currentBook, nextBook)) {
                    bookList.set(j, nextBook);
                    bookList.set(j + 1, currentBook);
                }
            }
        }
    }

    public static void filter(List<Book> bookList, MyFilterer filterer){
        for (int i = bookList.size() - 1; i >=0 ; i--) {

                Book book = bookList.get(i);

                if (!filterer.include(book)) {
                    bookList.remove(book);

                }

        }
    }
}
