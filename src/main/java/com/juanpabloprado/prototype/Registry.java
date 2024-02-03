package com.juanpabloprado.prototype;

import java.util.HashMap;
import java.util.Map;

import static com.juanpabloprado.prototype.Type.BOOK;
import static com.juanpabloprado.prototype.Type.MOVIE;

public class Registry {
    private Map<Type, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(Type type) {
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put(MOVIE, movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic Book");
        items.put(BOOK, book);
    }
}
