package dci.j24e01;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        URL customerURL = Main.class.getResource("/OneCustomer.json");

        Path customerPath = Path.of(customerURL.getPath());

        String content = Files.readString(customerPath);

        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        Customer customer = objectMapper.readValue(content, Customer.class);
        List<Customer> customers = objectMapper.readValue(content, new TypeReference<>(){});
        System.out.println(customers.stream().map(customer -> customer + "\n\n")
                .collect(Collectors.joining()));

    }
}