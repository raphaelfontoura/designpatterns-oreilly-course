package com.github.raphaelfontoura.designpatterns.templatemethod;

public abstract class AbstractQuery implements Query {

    @Override
    public Result execute() {
        FakeConnection c = new FakeConnection();
        Result r = c.execute(getQuery());
        c.close();
        return r;
    }

    protected abstract String getQuery();

}
