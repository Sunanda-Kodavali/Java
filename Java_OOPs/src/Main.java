public class Main {
    public static void main(String[] args) {

        // Task1 in Excercises
        Book book1 = new Book();
        book1.title = "The Immortals of Meluha";
        book1.author = "Amish Tripati";
        book1.price = 5;

        Book book2 = new Book();
        book2.title = "The Secret of Nagas";
        book2.author = "Amish Tripati";
        book2.price = 10;

        printBookDetails(book1);

        // Task2 in Excercises
        Movie movie1 = new Movie();
        movie1.title = "Harry Potter";
        movie1.genre = MovieGenre.DRAMA;
        movie1.price = 20;

        Movie movie2 = new Movie();
        movie2.title = "Our Planet";
        movie2.genre = MovieGenre.DOCUMENTARY;
        movie2.price = 30;

        printMovieDetails(movie1);

        // Task3 in Excercises
        Book[] books = {
                book1,
                book2
        };
        for (Book b : books){
            printBookDetails(b);
        }

        Movie[] movies = {
                movie1,
                movie2
        };

        int counter = 0;
        while (counter < movies.length){
            printMovieDetails(movies[counter]);
            counter+=1;
        }
    }

    private static void printMovieDetails(Movie movie) {
        System.out.printf("Title: %s, Genre: %s, Price: %d\n\n", movie.title, movie.genre, movie.price);
    }

    private static void printBookDetails(Book book) {
        System.out.printf("Title: %s, Author: %s, Price: %d\n\n", book.title, book.author, book.price);
    }
}