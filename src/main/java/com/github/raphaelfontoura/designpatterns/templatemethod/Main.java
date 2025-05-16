package com.github.raphaelfontoura.designpatterns.templatemethod;

public class Main {

    public static void main(String[] args) {
        Query q = new QueryPeople();
        executeQuery(q);
        Query q2 = new QueryCompanies();
        executeQuery(q2);
    }

    private static void executeQuery(Query q) {
        Result r = q.execute();
        r.printOutput();
    }
}
