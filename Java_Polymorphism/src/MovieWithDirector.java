public class MovieWithDirector extends Movie{
    private String director;

    public MovieWithDirector(long productId, int price, String title, MovieGenre genre, String director) {
        super(productId, price, title, genre);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ndirector: " + director;
    }
}
