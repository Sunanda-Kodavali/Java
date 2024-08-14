package dci.j24e01;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://swapi.dev/api/films")
                .build();
        try {
            Response response = client.newCall(request).execute();
            String responseBody = response.body().string();

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode filmsRootNode = objectMapper.readTree(responseBody);
            String openingCrawl = filmsRootNode.get("results").get(0).get("opening_crawl").asText();
            System.out.println(openingCrawl);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}