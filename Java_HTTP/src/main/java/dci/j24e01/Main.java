package dci.j24e01;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {

        URL url = new URI("https://swapi.dev/api/films").toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        InputStream content = (InputStream) connection.getContent();
        String body = new String(content.readAllBytes());
        content.close();
        ObjectMapper mapper = new ObjectMapper();
        Starwars starwars = mapper.readValue(body, Starwars.class);
        List<StarwarResults> results = starwars.results();
        List<StarwarCharacterandSpecies> characterwthspecies = new ArrayList<>();

        for (StarwarResults result : results) {

            if (result.episode_id() == 4 || result.episode_id() == 5 || result.episode_id() == 6) {
                String[] characterURLs = result.characters();
                System.out.println(Arrays.toString(characterURLs));
                for (String characterURL : characterURLs) {

                    url = new URI(characterURL).toURL();
                    connection = (HttpURLConnection) url.openConnection();
                    InputStream characterContent = (InputStream) connection.getContent();
                    String characterContentBody = new String(characterContent.readAllBytes());
                    characterContent.close();

                    StarwarCharacter starwarCharacter = mapper.readValue(characterContentBody, StarwarCharacter.class);

                        if (starwarCharacter.species().length > 0 ) {
                            List<String> species = new ArrayList<>();
                            for (String speciesURL : starwarCharacter.species()) {
                                url = new URI(speciesURL).toURL();
                                connection = (HttpURLConnection) url.openConnection();
                                InputStream speciesContent = (InputStream) connection.getContent();
                                String speciesContentBody = new String(speciesContent.readAllBytes());
                                speciesContent.close();
                                StarwarSpecies starwarSpecies = mapper.readValue(speciesContentBody, StarwarSpecies.class);

                                species.add(starwarSpecies.name());
                            }
                            characterwthspecies.add(new StarwarCharacterandSpecies(starwarCharacter.name(), species));
                        }else{
                            characterwthspecies.add(new StarwarCharacterandSpecies(starwarCharacter.name(), List.of("unknown")));
                        }
                }
            }
        }

        characterwthspecies.stream().distinct().forEach(starwarCharacterandSpecies -> System.out.println("Character name: " + starwarCharacterandSpecies.getName() + "   Species: " + starwarCharacterandSpecies.getSpecies()));
        System.out.println(characterwthspecies);
    }
}