package dci.j24e01;

public record Country(
        String code,
        String name,
        Continent continent,
        String region,
        Double surfaceArea,
        Integer independentYear,
        Integer population,
        Double lifeExpectancy,
        Double gnp,
        Double gnpOld,
        String localName,
        String governmentForm,
        String headOfState,
        Integer capital,
        String code2
) {

}

