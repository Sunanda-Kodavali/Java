package dci.j24e01;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Include (String type, int id, IncludedAttributes attributes) {

}
