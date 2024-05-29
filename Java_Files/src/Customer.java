import java.net.URL;
import java.time.LocalDate;

public record Customer(int index, String customerId, String firstName, String lastName, String company, String city,
                       String country, String phone1, String phone2, String email, LocalDate subscriptionDate,
                       URL website) {

}
