package dci.j24e01;

import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        String url = "https://pokeapi.co/api/v2/pokemon/";
//        NetworkService.getAsyncData(url, new NetworkServiceCallback() {
//            @Override
//            public void onResponse(String result) {
//                System.out.println("LIST RESULT:::");
//                System.out.println(result);
//            }
//        });
        NetworkService.getAsyncData(url, result -> {
            System.out.println("LIST RESULT:::");
            System.out.println(result);
        });

        System.out.println("I WAIT FOR NOONE!!!!!!");

    }

}