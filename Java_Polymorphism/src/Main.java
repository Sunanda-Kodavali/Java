import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();

        products.add(new Book(100L, 10, "The Immortals of Meluha", "Amish Tripati"));
        products.add(new Book(101L, 12,"The Secret of Nagas", "Amish Tripati"));
        products.add(new ChildrensBook(102L, 15,"The Secret of Nagas II", "Amish Tripati", "from 4 years"));
        products.add(new Movie(103L, 20, "Harry Potter", MovieGenre.DRAMA));
        products.add(new Movie(104L, 30, "Kantara", MovieGenre.ACTION));
        products.add(new MovieWithDirector(105L, 25, "Our Planet", MovieGenre.DOCUMENTARY, "Keith Scholey and Huw Cordey"));


        for (Product product : products) {
            System.out.println(product);
        }

    }


}