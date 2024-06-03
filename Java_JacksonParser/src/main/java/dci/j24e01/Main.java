package dci.j24e01;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        // Use Jackson library to parse the users.json file and create a list of users: List<User>

        URL customerURL = Main.class.getResource("/users.json");

        Path customerPath = Path.of(customerURL.getPath());

        String content = Files.readString(customerPath);

        ObjectMapper mapper = new ObjectMapper();

        JsonNode rootNode = mapper.readTree(content);

        List<User> users = new ArrayList<>();

        for (int i = 0; i < rootNode.size(); i++) {

            JsonNode userNode = rootNode.get(i);
            User user = addUser(userNode);
            users.add(user);

        }

        System.out.println(users.stream().map(user -> user + "\n\n")
                .collect(Collectors.joining()));


        try {
            // Write list to JSON file
            mapper.writeValue(new File("userList.json"), users);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static User addUser(JsonNode userNode) {

        int id = userNode.get("id").asInt();
        String name = userNode.get("name").asText();
        String userName = userNode.get("username").asText();
        String email = userNode.get("email").asText();
        JsonNode addressNode =  userNode.get("address");
        Address address = addAddress(addressNode);
        String phone = userNode.get("phone").asText();
        String website = userNode.get("website").asText();
        JsonNode companyNode =  userNode.get("company");
        Company company = addCompany(companyNode);
        return new User(id, name, userName, email, address, phone, website, company);


    }

    private static Company addCompany(JsonNode companyNode) {
        String name = companyNode.get("name").asText();
        String catchPhrase = companyNode.get("catchPhrase").asText();
        String bs = companyNode.get("bs").asText();
        return new Company(name, catchPhrase, bs);
    }

    private static Address addAddress(JsonNode addressNode) {
        String street = addressNode.get("street").asText();
        String suite = addressNode.get("suite").asText();
        String city = addressNode.get("city").asText();
        String zipcode = addressNode.get("zipcode").asText();
        JsonNode geoNode =  addressNode.get("geo");
        GeoLocation geo = addGeoLocation(geoNode);
        return new Address(street, suite, city, zipcode, geo);
    }

    private static GeoLocation addGeoLocation(JsonNode geoNode) {
        String lat = geoNode.get("lat").asText();
        String lng = geoNode.get("lng").asText();
        return new GeoLocation(lat, lng);
    }
}