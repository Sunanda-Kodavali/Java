import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("Bob");
        s.setBirthDate(LocalDate.of(2000, 1, 1));
        System.out.println(s.age());

        Book[] books = {
                new Book("The Immortals of Meluha", "Amish Tripati", 10),
                new Book("The Secret of Nagas", "Amish Tripati", 15)
        };

        for (Book b : books) {
            b.printBookDetails();
        }

        Movie[] movies = { new Movie("Harry Potter", MovieGenre.DRAMA, 20),
                new Movie("Kantara", MovieGenre.ACTION, 30),
                new Movie("Our Planet", MovieGenre.DOCUMENTARY, 30, "Keith Scholey and Huw Cordey")
        };

        for (Movie m : movies) {
            m.printMovieDetails();
        }

        RandomizeArray r = new RandomizeArray(new int[15]);
        System.out.println(Arrays.toString(r.getNumbers()));
    }
}