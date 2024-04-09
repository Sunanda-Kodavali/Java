import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("Bob");
        s.setBirthDate(LocalDate.of(2000,1,1));
        System.out.println(s.age());
    }
}