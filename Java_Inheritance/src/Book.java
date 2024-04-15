public class Book extends Product{
    private String title;
    private String author;

    public Book(long productId, int price, String title, String author) {
        super(productId, price);
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book" +"\n" + super.toString() +
                "title='" + title + '\'' +
                ", author='" + author + '\'';
    }
}
