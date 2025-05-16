package com.github.raphaelfontoura.designpatterns.templatemethod;

import java.util.List;

public class FakeConnection {

    private final List<String> peopleList = List.of("John Doe", "Jane Smith", "Alice Johnson");
    private final List<String> companyList = List.of("Tech Corp", "Health Inc", "Finance LLC");

    public Result execute(String query) {
        System.out.println("Executing query: " + query);
        if (query.equals("SELECT * FROM people")) {
            return new Result(peopleList);
        } else if (query.equals("SELECT * FROM company")) {
            return new Result(companyList);
        }
        return new Result();
    }

    public void close() {
        System.out.println("Closing connection");
    }
}
