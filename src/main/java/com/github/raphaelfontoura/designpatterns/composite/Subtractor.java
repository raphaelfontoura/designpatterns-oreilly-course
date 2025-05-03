package com.github.raphaelfontoura.designpatterns.composite;

public class Subtractor extends BinaryExpression {

    public Subtractor(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return left.getValue() - right.getValue();
    }

}
