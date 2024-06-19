package dci.j24e01;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class OkHttpService implements NetworkService{

    private final OkHttpClient client;


    public OkHttpService() {
       client = new OkHttpClient();
    }

    @Override
    public String getContent(String url) {
        Request request = new Request.Builder().url(url).build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
