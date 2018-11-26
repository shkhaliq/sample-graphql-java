package com.samplegraphql;

import java.util.List;

public class User {

    private final String firstName;
    private final String lastName;
    private final List<Book> books;

    public User(String firstName, String lastName, List<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Book> getBooks() {
        return books;
    }
}