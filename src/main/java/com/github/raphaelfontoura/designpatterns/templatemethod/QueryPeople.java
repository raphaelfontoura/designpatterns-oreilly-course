package com.github.raphaelfontoura.designpatterns.templatemethod;

public class QueryPeople extends AbstractQuery {

    @Override
    protected String getQuery() {
        return "SELECT * FROM people";
    }

}
