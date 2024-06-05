package dci.j24e01;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record StarwarResults (int episode_id, String[] characters){
}
