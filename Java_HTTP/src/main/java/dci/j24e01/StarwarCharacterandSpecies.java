package dci.j24e01;

import java.util.List;
import java.util.Objects;

public class StarwarCharacterandSpecies {

    private String name;
    private List<String> species;

    public StarwarCharacterandSpecies(String name, List<String> species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSpecies() {
        return species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "StarwarCharacterandSpecies{" +
                "name='" + name + '\'' +
                ", species=" + species +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarwarCharacterandSpecies that = (StarwarCharacterandSpecies) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
