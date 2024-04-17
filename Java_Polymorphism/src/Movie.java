public class Movie extends Product{
    private String title;
    private MovieGenre genre;
    private String director;

    public Movie(long productId, int price, String title, MovieGenre genre, String director) {
        super(productId, price);
        this.title = title;
        this.genre = genre;
        this.director = director;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "---------------Movie Details-----------" + "\n"
                + super.toString() +
                "\ntitle: " + title +
                "\ngenre: " + genre +
                "\ndirector: " + director;
    }
}
