package BookLibrary;

public class Book {

    private final int ISBN;
    private final String title;
    private final String author;
    private final Category category;

    public Book(int ISBN, String title, String author, Category category) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Category getCategory() {
        return category;
    }
}
