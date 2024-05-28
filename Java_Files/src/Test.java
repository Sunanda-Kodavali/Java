import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException, URISyntaxException {

        URL url= Test.class.getResource("customers-1000.csv");
        System.out.println(url);
        File file=new File(url.toURI());

        Scanner scanner=new Scanner(file);
        List<Customer> customers = new ArrayList<>();

        int i = 0;
        while (scanner.hasNextLine()) {

            if(i == 0){
                scanner.nextLine();
            }else {

                String[] inputs = scanner.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                int index = Integer.parseInt(inputs[0]);
                String customerId = inputs[1];
                String firstName = inputs[2];
                String lastName = inputs[3];
                String company = inputs[4];
                String city = inputs[5];
                String country = inputs[6];
                String phone1 = inputs[7];
                String phone2 = inputs[8];
                String email = inputs[9];
                LocalDate subscriptionDate = LocalDate.parse(inputs[10]);
                URL website = new URL(inputs[11]);
                customers.add(new Customer(index, customerId, firstName, lastName, company, city, country, phone1, phone2, email, subscriptionDate, website));
            }
            i++;
        }
        System.out.println("Records added:"+customers.size());
//        How many customers are from France?

        int counter = 0, counter1 = 0;
        for (Customer c: customers){
            if (c.getCountry().equalsIgnoreCase("France")){
                counter++;
            }

            if(c.getSubscriptionDate().getYear() == 2020){
                counter1++;
            }
        }
        System.out.println("France Customers :"+counter);
        System.out.println("Customers subscribed in 2020: "+counter1);

    }
}
