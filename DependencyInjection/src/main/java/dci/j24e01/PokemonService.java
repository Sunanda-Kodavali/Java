package dci.j24e01;

public class PokemonService {

    private final NetworkService networkService;

    public PokemonService(NetworkService networkService) {
        this.networkService = networkService;
    }
    public String getAll(){
        return networkService.getContent("https://pokeapi.co/api/v2/pokemon");
    }
}
