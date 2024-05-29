//        Given the file customers-1000.csv
//
//        Create a new Customer Class/Record.
//        Parse the file into a list of customers List<Customer>
//        How many customers are from France?
//        How many customers subscribed in 2020?
//        Try it with with the customers-100000.csv

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
    public static void main(String[] args) throws IOException, URISyntaxException {

        BufferedReader br =new BufferedReader(new
                InputStreamReader(Objects.requireNonNull(Test.class.getClassLoader().getResourceAsStream("customers-100000.csv"))));

        List<Customer> customers = new ArrayList<>();

        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {

                String[] inputs = line.split(",(?!\\s)");
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
                URL website = new URI(inputs[11]).toURL();
                customers.add(new Customer(index, customerId, firstName, lastName, company, city, country, phone1, phone2, email, subscriptionDate, website));

        }

        System.out.println("Records added:"+customers.size());

        int counter = 0, counter1 = 0;
        for (Customer c: customers){
            if (c.country().equalsIgnoreCase("France")){
                counter++;
            }

            if(c.subscriptionDate().getYear() == 2020){
                counter1++;
            }
        }
        System.out.println("France Customers :"+counter);
        System.out.println("Customers subscribed in 2020: "+counter1);

    }
}
