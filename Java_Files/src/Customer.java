import java.net.URL;
import java.time.LocalDate;

public class Customer {

  //  Index,Customer Id,First Name,Last Name,Company,City,Country,Phone 1,Phone 2,Email,Subscription Date,Website
    private final int index;
    private final String customerId;
    private final String firstName;
    private final String lastName;
    private final String company;
    private final String city;
    private final String country;
    private final String phone1;
    private final String phone2;
    private final String email;
    private final LocalDate subscriptionDate;
    private final URL website;

    public Customer(int index, String customerId, String firstName, String lastName, String company, String city, String country, String phone1, String phone2, String email, LocalDate subscriptionDate, URL website) {
        this.index = index;
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.city = city;
        this.country = country;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.subscriptionDate = subscriptionDate;
        this.website = website;
    }

    public int getIndex() {
        return index;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone1() {
        return phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getSubscriptionDate() {
        return subscriptionDate;
    }

    public URL getWebsite() {
        return website;
    }
}
