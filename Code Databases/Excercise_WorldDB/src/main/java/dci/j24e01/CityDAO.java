package dci.j24e01;

import java.util.List;

public interface CityDAO {

    City findCity(Integer id);

    List<City> findAllCities();

    City updateCity(City city);

    City insertCity(City city);

    boolean deleteCity(Integer id);
}
