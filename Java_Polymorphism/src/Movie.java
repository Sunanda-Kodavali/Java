public class Movie extends Product{
    private String title;
    private MovieGenre genre;

    public Movie(long productId, int price, String title, MovieGenre genre) {
        super(productId, price);
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }



    @Override
    public String toString() {
        return "---------------Movie Details-----------" + "\n"
                + super.toString() +
                "\ntitle: " + title +
                "\ngenre: " + genre ;
    }
}
