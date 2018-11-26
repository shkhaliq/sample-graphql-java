package com.samplegraphql;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRepository {

    private final List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
        users.add(new User("Saad", "Anjum", getNewBooks()));
        users.add(new User("Haris", "Khaliq", getNewBooks()));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void saveUser(User user) {
        users.add(user);
    }

    private List<Book> getNewBooks() {
        List<Book> myBooks = new ArrayList<Book>();
        myBooks.add(new Book("Of Mice and Men"));
        myBooks.add(new Book("Fancy Book"));
        myBooks.add(new Book("Other Fancy one"));
        return myBooks;
    }
}