package dci.j24e01;

public enum IsOfficial {
    T('T'),
    F('F');

    private final char value;

    IsOfficial(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public static IsOfficial fromValue(char value) {
        for (IsOfficial isOfficial : IsOfficial.values()) {
            if (isOfficial.getValue() == value) {
                return isOfficial;
            }
        }
        throw new IllegalArgumentException("Unexpected value: " + value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

