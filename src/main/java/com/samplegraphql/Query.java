package com.samplegraphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import java.util.List;

public class Query implements GraphQLRootResolver {

    private final UserRepository users;

    public Query(UserRepository userRepository) {
        this.users = userRepository;
    }

    public List<User> allUsers() {
        return users.getAllUsers();
    }
}