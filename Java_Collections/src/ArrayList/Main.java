package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Immortals of Meluha", "Amish Tripati", 10));
        books.add(new Book("The Secret of Nagas", "Amish Tripati", 15));

        for (Book b : books) {
            b.printBookDetails();
        }

        Map<Long, Movie> movieMap = new HashMap<>();
        movieMap.put(111L, new Movie("Harry Potter", MovieGenre.DRAMA, 20, 111));
        movieMap.put(122L, new Movie("Kantara", MovieGenre.ACTION, 30, 122));
        movieMap.put(123L, new Movie("Our Planet", MovieGenre.DOCUMENTARY, 30, "Keith Scholey and Huw Cordey", 123));

        for (Long id : movieMap.keySet()) {
            System.out.println("Key::"+id+" Value::"+movieMap.get(id).toString());
        }

        long pId = 123L;
        Movie m =  findMovieById(pId, movieMap);

        if(m != null){
            System.out.print("Found this movie: ");
            m.printMovieDetails();
        }else {
            System.out.println("Didn't find a movie with productId: "+ pId);
        }

    }

    private static Movie findMovieById(long id, Map<Long, Movie> movieMap){

        if(movieMap.containsKey(id)){
                return movieMap.get(id);
        }
        return  null;
    }
}