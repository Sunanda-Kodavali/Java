import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();
//
//        products.add(new Book(100L, "The Immortals of Meluha", "Amish Tripati", 10));
//        products.add(new Book(101L,"The Secret of Nagas", "Amish Tripati", 12));
//        products.add(new ChildrensBook(102L,"The Secret of Nagas II", "Amish Tripati", "from 4 years", 15));
//        products.add(new Movie(103L, "Harry Potter", MovieGenre.DRAMA, 20));
//        products.add(new Movie(104L, "Kantara", MovieGenre.ACTION, 30));
//        products.add(new MovieWithDirector(105L, "Our Planet", MovieGenre.DOCUMENTARY, "Keith Scholey and Huw Cordey", 25));
//

//        for (Product product : products) {
//            product.printDetails();
//        }

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(103, "Harry Potter", MovieGenre.DRAMA, 20));
        movies.add(new Movie(105, "Our Planet", MovieGenre.DOCUMENTARY, 25));
        movies.add(new Movie(104, "Kantara", MovieGenre.ACTION, 30));
        products.addAll(movies);
        Collections.sort(movies);
        for (Movie movie : movies) {
            movie.printDetails();
        }

    }


}