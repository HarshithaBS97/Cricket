package utils;

public enum ResourceName {
    ROYAL_CHALLENGERS("royalChallengers");

    private String name;

    ResourceName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
