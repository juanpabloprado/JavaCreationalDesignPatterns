package com.juanpabloprado.prototype;

public enum Type {
    MOVIE("Movie"),
    BOOK("Book");

    private final String displayName;

    Type(String displayName) {
        this.displayName = displayName;
    }


    public String getDisplayName() {
        return displayName;
    }
}
