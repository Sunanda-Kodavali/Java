package dci.j24e01;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        URL customerURL = Main.class.getResource("/Sample.json");

        Path customerPath = Path.of(customerURL.getPath());

        String content = Files.readString(customerPath);

        ObjectMapper objectMapper = new ObjectMapper();

        Sample sample = objectMapper.readValue(content, Sample.class);

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(sample);
        System.out.println(json);
    }
}