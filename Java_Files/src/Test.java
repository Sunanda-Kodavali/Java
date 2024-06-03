//        Given the file customers-1000.csv
//
//        Create a new Customer Class/Record.
//        Parse the file into a list of customers List<Customer>
//        How many customers are from France?
//        How many customers subscribed in 2020?
//        Try it with with the customers-100000.csv



import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
    public static void main(String[] args) throws IOException, URISyntaxException {

//        FileReader fr = new FileReader(Path.of(Objects.requireNonNull(FileReadWays.class.getResource("customers-100000.csv")).toURI()).toString());
//        BufferedReader br =new BufferedReader(fr);

        BufferedReader br =new BufferedReader(new
                InputStreamReader(Objects.requireNonNull(Test.class.getClassLoader().getResourceAsStream("customers-1000.csv"))));

        List<Customer> customers = new ArrayList<>();

        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
                customers.add(addCustomer(line));

        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        try {
            // Write list to JSON file
            mapper.writeValue(new File("list.json"), customers);
            System.out.println("List written to JSON file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
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

    private static Customer addCustomer(String line) throws URISyntaxException, MalformedURLException {
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
       return new Customer(index, customerId, firstName, lastName, company, city, country, phone1, phone2, email, subscriptionDate, website);
    }
}
