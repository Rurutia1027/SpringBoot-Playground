package com.cloud.graphqlspring;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id, String name, Integer pageCount, Integer authorId) {
    public static List<Book> books = Arrays.asList(
            new Book(1, "Quran", 604, 1),
            new Book(2, "Harry Potter", 700, 2),
            new Book(3, "Foobar", 2342, 3),
            new Book(1, "Spring Boot", 234, 2)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream().filter(item -> item.id.equals(id)).findFirst();
    }
}
