package dci.j24e01;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class NetworkService {

    public static String getData(String url)  {
        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = null;
        try {
            response = httpClient.newCall(request).execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(response.code());
        System.out.println(response.body());

        String result = null;
        try {
            result = response.body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;

    }

    public static void getAsyncData(String url, NetworkServiceCallback callback)  {
        new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpClient httpClient = new OkHttpClient();
                Request request = new Request.Builder()
                        .url(url)
                        .build();

                Response response = null;
                try {
                    response = httpClient.newCall(request).execute();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
//                System.out.println(response.code());
//                System.out.println(response.body());

                String result = null;
                try {
                    result = response.body().string();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                callback.onResponse(result);
            }
        }).start();
    }
}