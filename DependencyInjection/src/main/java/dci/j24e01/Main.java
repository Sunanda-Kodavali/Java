package dci.j24e01;

public class Main {
    public static void main(String[] args) {

        NetworkService ns = new OkHttpService();
//        NetworkService ns = new JavaNetHTTPService();
        PokemonService pokemonService = new PokemonService(ns);
        String result =  pokemonService.getAll();
        System.out.println(result);
    }
}