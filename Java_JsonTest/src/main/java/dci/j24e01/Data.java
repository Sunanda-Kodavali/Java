package dci.j24e01;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Data (int id, String type, DataAttributes attributes, DataRelationships relationships){
}
