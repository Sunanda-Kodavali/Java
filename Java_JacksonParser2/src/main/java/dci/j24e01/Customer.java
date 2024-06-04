package dci.j24e01;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Customer(@JsonProperty("Index") int id,
                       @JsonProperty("First Name") String firstName,
                       @JsonProperty("Last Name") String lastName) {
    public String name(){
        return firstName +" "+ lastName;
    }
}
