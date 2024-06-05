package dci.j24e01;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
       URL url = new URI("https://swapi.dev/api/films").toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        InputStream content = (InputStream) connection.getContent();
        String body = new String(content.readAllBytes());
        System.out.println(body);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(body);
        String opening = root.get("results").get(0).get("opening_crawl").asText();
        System.out.println(opening);

    }
}