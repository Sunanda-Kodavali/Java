package dci.j24e01;

import java.util.List;

public interface CountryLanguageDAO {

    CountryLanguage findCountryLanguage(CountryLanguage countryLanguage);

    List<CountryLanguage> findAllCountriesLanguages();

    CountryLanguage updateCountryLanguage(CountryLanguage countryLanguage);

    CountryLanguage insertCountryLanguage(CountryLanguage countryLanguage);

    boolean deleteCountryLanguage(CountryLanguage countryLanguage);
}
