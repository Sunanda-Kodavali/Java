package dci.j24e01.HTest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws URISyntaxException, IOException {
        URL filmsURL = (new URI("https://swapi.dev/api/films")).toURL();
        InputStream filmsIn = (InputStream) filmsURL.getContent();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode filmsRootNode = objectMapper.readTree(filmsIn);

        Set<String> characterLinks = new HashSet<>();

        for (JsonNode charactersNode : filmsRootNode.get("results").get(0).get("characters")) {
            characterLinks.add(charactersNode.asText());
        }

        for (JsonNode charactersNode : filmsRootNode.get("results").get(1).get("characters")) {
            characterLinks.add(charactersNode.asText());
        }

        for (JsonNode charactersNode : filmsRootNode.get("results").get(2).get("characters")) {
            characterLinks.add(charactersNode.asText());
        }

        System.out.println(characterLinks);
        System.out.println(characterLinks.size());

        Set<SWCharacter> swCharacters = new HashSet<>();

        int counter = 0;
        for (String characterLink : characterLinks) {
            counter ++;
//            double percent = (double)counter / characterLinks.size();
//            System.out.println("Loading: " + (int)(percent * 100) + "%");

            System.out.println("Loading: " + counter + "/" + characterLinks.size());

            URL characterURL = (new URI(characterLink)).toURL();
            InputStream characterIn = (InputStream) characterURL.getContent();

            SWCharacter swCharacter = objectMapper.readValue(characterIn, new TypeReference<>() {});
            swCharacters.add(swCharacter);
        }

        System.out.println(swCharacters);

    }
}
