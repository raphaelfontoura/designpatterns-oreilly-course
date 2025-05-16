package com.github.raphaelfontoura.designpatterns.templatemethod;

public class QueryCompanies extends AbstractQuery {

    @Override
    protected String getQuery() {
        return "SELECT * FROM company";
    }

}
