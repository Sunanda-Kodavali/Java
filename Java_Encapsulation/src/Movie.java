public class Movie {
    private String title;
    private MovieGenre genre;
    private int price;
    private String director;

    public Movie(String title, MovieGenre genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public Movie(String title, MovieGenre genre, int price, String director) {
        this(title, genre, price);
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void printMovieDetails() {
        if (director != null){
            System.out.printf("Title: %s, Genre: %s, Price: %d, Director: %s\n", title, genre, price, director);
        }else{
            System.out.printf("Title: %s, Genre: %s, Price: %d\n", title, genre, price);
        }

    }
}
