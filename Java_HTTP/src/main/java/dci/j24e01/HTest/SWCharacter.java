package dci.j24e01.HTest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SWCharacter(
        String name,
        String height,
        @JsonProperty("birth_year") String birthYear
) {
}
