import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();

        products.add(new Book(100L, 10, "The Immortals of Meluha", "Amish Tripati"));
        products.add(new Book(101L, 12,"The Secret of Nagas", "Amish Tripati"));
        products.add(new ChildrensBook(102L, 15,"The Secret of Nagas II", "Amish Tripati", "from 4 years"));
        products.add(new Movie(103L, 20, "Harry Potter", MovieGenre.DRAMA, "J. K. Rowling"));
        products.add(new Movie(104L, 30, "Kantara", MovieGenre.ACTION, "Rishabh shetty"));
        products.add(new Movie(105L, 25, "Our Planet", MovieGenre.DOCUMENTARY, "Keith Scholey and Huw Cordey"));


        for (Product product : products) {
            if (product instanceof Book book) {
                System.out.println(book);
            } else if (product instanceof Movie movie) {
                System.out.println(movie);
            }else {
                System.out.println("Its neither a Book nor a Movie");
            }
        }

    }


}