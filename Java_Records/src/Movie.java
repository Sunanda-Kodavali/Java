public record Movie (
        String title,
        String plot,
        int releaseYear,
        String director
) implements Comparable<Movie> {

    public Movie {
        System.out.println("Hello a movie was created");
    }

    public Movie(String title, int releaseYear, String director) {
        this(title, "Plot unavailable", releaseYear, director);
    }

    @Override
    public int compareTo(Movie o) {
        return title().compareTo(o.title());
    }

}