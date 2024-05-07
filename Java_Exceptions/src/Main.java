import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        try {
            products.add(new Book(100L, "The Immortals of Meluha", "Amish Tripati", 10));
            products.add(new Book(101L, "The Secret of Nagas", "Amish Tripati", 12));
            products.add(new ChildrensBook(-102L, "The Secret of Nagas II", "Amish Tripati", "from 4 years", 15));
            products.add(new Movie(103L, "Harry Potter", MovieGenre.DRAMA, 20));
            products.add(new Movie(104L, "Kantara", MovieGenre.ACTION, 30));
            products.add(new MovieWithDirector(105L, "Our Planet", MovieGenre.DOCUMENTARY, "Keith Scholey and Huw Cordey", 25));
        } catch (IncorrectProductIdException e) {
            System.out.println(e.getMessage());
        }
        for (Product product : products) {
            product.printDetails();
        }
    }
}