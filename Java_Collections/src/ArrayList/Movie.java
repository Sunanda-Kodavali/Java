package ArrayList;

import java.util.Map;

public class Movie {
    private String title;
    private MovieGenre genre;
    private int price;
    private String director;
    private long productId;

    public Movie(String title, MovieGenre genre, int price, long productId) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.productId = productId;
    }

    public Movie(String title, MovieGenre genre, int price, String director, long productId) {
        this (title, genre, price, productId);
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

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void printMovieDetails() {

        if (director != null){
            System.out.printf("Product Id: %d, Title: %s, Genre: %s, Price: %d, Director: %s\n", productId, title, genre, price, director);
        }else{
            System.out.printf("Product Id: %d, Title: %s, Genre: %s, Price: %d\n", productId, title, genre, price);
        }
    }
    public static Movie findMovieById(long id, Map<Long, Movie> movieMap){

        if(movieMap.containsKey(id)){
            return movieMap.get(id);
        }
        return  null;
    }
}
