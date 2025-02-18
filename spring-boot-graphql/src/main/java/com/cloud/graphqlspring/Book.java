package com.cloud.graphqlspring;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id, String name, Integer pageCount) {
    public static List<Book> books = Arrays.asList(
            new Book(1, "Quran", 604),
            new Book(2, "Harry Potter", 700),
            new Book(3, "Foobar", 2342),
            new Book(1, "Spring Boot", 234)
    );
}
