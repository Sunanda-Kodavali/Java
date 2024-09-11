package dci.j24e01;

public record CountryLanguage(
        String countryCode,
        String language,
        IsOfficial isOfficial,
        Double percentage
) {

}

