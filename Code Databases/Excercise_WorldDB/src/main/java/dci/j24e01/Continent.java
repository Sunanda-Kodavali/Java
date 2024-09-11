package dci.j24e01;

public enum Continent {
    ASIA("Asia"),
    EUROPE("Europe"),
    NORTH_AMERICA("North America"),
    AFRICA("Africa"),
    OCEANIA("Oceania"),
    ANTARCTICA("Antarctica"),
    SOUTH_AMERICA("South America");

    private final String continentName;

    Continent(String continentName) {
        this.continentName = continentName;
    }


    public String getContinentName() {
        return this.continentName;
    }

    @Override
    public String toString() {
        return this.continentName;
    }
}

