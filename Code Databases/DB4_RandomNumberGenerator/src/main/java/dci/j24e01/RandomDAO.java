package dci.j24e01;

import java.util.List;

public interface RandomDAO {

    RandomBean insertRandom();
    List<RandomBean> findAllRandoms();
}
