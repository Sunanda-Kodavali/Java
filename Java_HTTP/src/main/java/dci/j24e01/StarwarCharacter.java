package dci.j24e01;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record StarwarCharacter (String name, String[] species){
}
