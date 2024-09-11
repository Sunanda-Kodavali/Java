package dci.j24e01;

import java.util.List;

public interface CountryDAO {

    Country findCountry(String countryCode);

    List<Country> findAllCountries();

    Country updateCountry(String countryCode);

    Country insertCountry(Country country);

    boolean deleteCountry(String countryCode);
}
