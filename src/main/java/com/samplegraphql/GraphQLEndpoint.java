package com.samplegraphql;

import com.coxautodev.graphql.tools.SchemaParser;
import javax.servlet.annotation.WebServlet;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;


@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    public GraphQLEndpoint() {
        super(buildSchema());
    }

    private static GraphQLSchema buildSchema() {
        UserRepository userRepository = new UserRepository();
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new Query(userRepository))
                .build()
                .makeExecutableSchema();
    }
}
