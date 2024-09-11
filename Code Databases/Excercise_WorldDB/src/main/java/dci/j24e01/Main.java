package dci.j24e01;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world",
                "root",
                "sunanda123"
        );

   /*     CityDAO cityDAO = new CityDAOImpl(connection);*/

      /*  City city = cityDAO.findCity(5);
        System.out.println(city);*/

      /* System.out.println(cityDAO.findAllCities());*/

       /* System.out.println(cityDAO.deleteCity(10));*/

       /* System.out.println(cityDAO.updateCity(new City(12,"Ahmedabad", "IND","Ahmedabad" ,1)));*/

        /*System.out.println(cityDAO.insertCity(new City(null,"Vinukonda", "IND","Vinukonda" ,10)));*/

        CountryDAO countryDAO = new CountryDAOImpl(connection);
      /*  System.out.println(countryDAO.findCountry("AFG"));*/


       /* System.out.println(countryDAO.findAllCountries());*/
      /*  System.out.println(countryDAO.deleteCountry("IND"));*/
       /* System.out.println(countryDAO.insertCountry(new Country(
                "HAR","Africa", Continent.AFRICA, "sample", 12.3, 12, 12, 13.4, 14.1,
                15.3, "india","BJP","Prime Minister", 10, "s"
        )));*/

        CountryLanguageDAO countryLanguageDAO = new CountryLanguageDAOImpl(connection);
       /* System.out.println(countryLanguageDAO.findCountryLanguage(new CountryLanguage("IND", "Hindi",null,null)));

        System.out.println(countryLanguageDAO.findAllCountriesLanguages());

        System.out.println(countryLanguageDAO.updateCountryLanguage(new CountryLanguage("AFG", "Dari",IsOfficial.F,10.5)));*/

       /* System.out.println(countryLanguageDAO.insertCountryLanguage(new CountryLanguage("IND", "Tulu",IsOfficial.F,10.5)));*/

        System.out.println(countryLanguageDAO.deleteCountryLanguage(new CountryLanguage("IND", "Urdu",null,null)));

    }

}