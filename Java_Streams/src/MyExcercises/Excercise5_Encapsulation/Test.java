package MyExcercises.Excercise5_Encapsulation;

public class Test {
    public static void main(String[] args) {

        Book b1 = new Book("Harry Potter", "J. K. Rowling", 11.0);
        Book b2 = new Book("Harry Potter I", "J. K. Rowling Bro", 12.0);
        Book b3 = new Book("Harry Potter II", "J. K. Rowling Sis", 21.0);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


    }
}
