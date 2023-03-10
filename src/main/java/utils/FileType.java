package utils;

public enum FileType {

    JSON(".json");

    private String name;

    FileType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}